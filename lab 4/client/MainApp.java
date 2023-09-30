package client;

import domain.models.*;
import domain.factory.*;
import domain.service.BuyingServiceInterface;
import domain.service.BuyingServiceProxy;
import domain.strategy.SpecialDiscountStrategy;
import domain.command.BuyCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        ShoeInterface BoughtShoe = null;
        ShoeInterface nikeShoe = new ShoeBuilder()
                .setBrand("Nike")
                .setSize(42)
                .setType("sports")
                .setPrice(120.00)
                .setStockCount(10)
                .build();

        ShoeInterface adiasShoe = new ShoeBuilder()
                .setBrand("Adidas")
                .setSize(42)
                .setType("sports")
                .setPrice(125.00)
                .setStockCount(10)
                .build();

        ShoeInterface pumaShoe = new ShoeBuilder()
                .setBrand("Puma")
                .setSize(44)
                .setType("sports")
                .setPrice(130.00)
                .setStockCount(10)
                .build();

        ShoeInterface nbShoe = new ShoeBuilder()
                .setBrand("New Balance")
                .setSize(41)
                .setType("sports")
                .setPrice(115.00)
                .setStockCount(10)
                .build();

        List<ShoeInterface> shoes = new ArrayList<>();
        shoes.add(nikeShoe);
        shoes.add(adiasShoe);
        shoes.add(pumaShoe);
        shoes.add(nbShoe);
        Random random = new Random();
        BoughtShoe = shoes.get(random.nextInt(shoes.size()));

        CustomerFactory customerFactory = new CustomerFactory();
        Customer customer1 = customerFactory.createCustomer("Stephanie O'Connor", "stephoconnor@gmail.com");
        Customer customer2 = customerFactory.createCustomer("Alex Johnson", "alexjohnson1234@gmail.com");
        SpecialOnlineBuyer customer3 = new SpecialOnlineBuyer("Jessica Ramirez", "jessicaR89@gmail.com");
        Customer customer4 = customerFactory.createCustomer("Benjamin Lee", "benlee56@gmail.com");

        // Applying Strategy Pattern
        customer3.setDiscountStrategy(new SpecialDiscountStrategy());

        List<CustomerComponent> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        CustomerComponent selectedCustomer = customers.get(random.nextInt(customers.size()));

        System.out.println(selectedCustomer + " chose " + BoughtShoe);

        // Using Proxy Pattern
        BuyingServiceInterface buyingService = new BuyingServiceProxy();

        // Using Command Pattern
        BuyCommand buyCommand = new BuyCommand(selectedCustomer, BoughtShoe);

        if (random.nextBoolean()) {
            buyCommand.executeOnline();
        } else {
            buyCommand.executeInStore();
        }

        // Applying Observer Pattern
        ShoeStore shoeStore = new ShoeStore();
        customers.forEach(shoeStore::addCustomer);
        shoeStore.newShoesArrived();

        // Applying Iterator Pattern
        ShoeCollection shoeCollection = new ShoeCollection(shoes);
        System.out.println("Available Shoes:");
        for (ShoeInterface shoe : shoeCollection) {
            System.out.println(shoe);
        }
    }
}
