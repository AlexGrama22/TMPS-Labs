package domain.factory;

import domain.models.Customer;
import domain.models.Shoe;

public interface StoreFactory {
    Customer createCustomer(String name, String email);
    Shoe createShoe(String brand, int size, String type, double price, int stockCount);
}