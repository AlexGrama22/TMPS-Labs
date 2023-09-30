package domain.factory;

import domain.models.Customer;

public class CustomerFactory {
    public Customer createCustomer(String name, String email) {
        return new Customer(name, email);
    }
}
