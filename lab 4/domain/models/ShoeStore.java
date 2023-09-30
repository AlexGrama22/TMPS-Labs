package domain.models;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    private List<CustomerComponent> observers = new ArrayList<>();

    public void addCustomer(CustomerComponent customer) {  // Changed to CustomerComponent
        observers.add(customer);
    }

    public void newShoesArrived() {
        for (CustomerComponent customer : observers) {
            if (customer instanceof Customer) {  // Check if it is a Customer instance
                ((Customer) customer).notify("New shoes have arrived!");
            }
        }
    }
}
