package domain.factory;

import domain.models.Customer;
import domain.models.Shoe;

public class SportStoreFactory implements StoreFactory {

    @Override
    public Customer createCustomer(String name, String email) {
        return new Customer(name, email);
    }

    @Override
    public Shoe createShoe(String brand, int size, String type, double price, int stockCount) {
        return new Shoe(brand, size, type, price, stockCount);
    }
}
