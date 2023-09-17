package client;

import domain.models.*;
import domain.factory.*;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        ShoeFactory shoeFactory = new ShoeFactory();
        Shoe BoughtShoe = null;
        Shoe nikeShoe = shoeFactory.createShoe("Nike", 42, "sports", 120.00, 10);
        Shoe adiasShoe = shoeFactory.createShoe("Adidas", 40, "sports", 128.00, 12);
        Shoe pumaShoe = shoeFactory.createShoe("Puma", 43, "sports", 134.00, 13);
        Shoe nbShoe = shoeFactory.createShoe("New Balance", 44, "sports", 119.00, 14);
        Random random = new Random();
        int randomValue = random.nextInt(4);
            switch (randomValue) {
                case 0:
                    BoughtShoe = nikeShoe;
                    break;
                case 1:
                    BoughtShoe = adiasShoe;
                    break;
                case 2:
                    BoughtShoe = pumaShoe;
                    break;
                case 3:
                    BoughtShoe = nbShoe;
                    break;
                default:
                    System.out.println("No case matched");
            }

//        System.out.println("Created shoe: " + nikeShoe);
//        System.out.println("Created shoe: " + adiasShoe);
//        System.out.println("Created shoe: " + pumaShoe);
//        System.out.println("Created shoe: " + nbShoe);

        Customer customer = null;
        Customer customer1 = new Customer("Stephanie O'Connor", "stephoconnor@gmail.com");
        Customer customer2 = new Customer("Alex Johnson", "alexjohnson1234@gmail.com");
        Customer customer3 = new Customer("Jessica Ramirez", "jessicaR89@gmail.com");
        Customer customer4 = new Customer("Benjamin Lee", "benlee56@gmail.com");
        int randomCostumer = random.nextInt(4);
            switch (randomCostumer) {
                case 0:
                    customer = customer1;
                    break;
                case 1:
                    customer = customer2;
                    break;
                case 2:
                    customer = customer3;
                    break;
                case 3:
                    customer = customer4;
                    break;
                default:
                    System.out.println("No case matched");
            }

        System.out.println(customer.getName() + " chose " + BoughtShoe.toString() );

        if (random.nextBoolean()) {
            customer.buyShoeOnline(BoughtShoe);
        } else {
            customer.buyShoeInStore(BoughtShoe);
        }
    }
}