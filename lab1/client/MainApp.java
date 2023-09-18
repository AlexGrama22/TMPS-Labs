package client;

import domain.models.*;
import domain.factory.*;
import domain.service.BuyingService;

import java.util.Random;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ShoeFactory shoeFactory = new ShoeFactory();
        Shoe BoughtShoe = null;
        Shoe nikeShoe = shoeFactory.createShoe("Nike", 42, "sports", 120.00, 10);
        Shoe adiasShoe = shoeFactory.createShoe("Adidas", 40, "sports", 128.00, 12);
        Shoe pumaShoe = shoeFactory.createShoe("Puma", 43, "sports", 134.00, 13);
        Shoe nbShoe = shoeFactory.createShoe("New Balance", 44, "sports", 119.00, 14);

        List<Shoe> shoes = List.of(nikeShoe, adiasShoe, pumaShoe, nbShoe);
        Random random = new Random();
        BoughtShoe = shoes.get(random.nextInt(shoes.size()));

        CustomerFactory customerFactory = new CustomerFactory();
        Customer customer1 = customerFactory.createCustomer("Stephanie O'Connor", "stephoconnor@gmail.com");
        Customer customer2 = customerFactory.createCustomer("Alex Johnson", "alexjohnson1234@gmail.com");
        SpecialOnlineBuyer customer3 = new SpecialOnlineBuyer("Jessica Ramirez", "jessicaR89@gmail.com");
        Customer customer4 = customerFactory.createCustomer("Benjamin Lee", "benlee56@gmail.com");

        List<Customer> customers = List.of(customer1, customer2, customer3, customer4);
        Customer selectedCustomer = customers.get(random.nextInt(customers.size()));

        System.out.println(selectedCustomer.getName() + " chose " + BoughtShoe);

        BuyingService buyingService = new BuyingService();
        if (random.nextBoolean()) {
            buyingService.buyOnline(selectedCustomer, BoughtShoe);
        } else {
            buyingService.buyInStore(selectedCustomer, BoughtShoe);
        }
    }
}
