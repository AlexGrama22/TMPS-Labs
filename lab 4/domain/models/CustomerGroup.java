package domain.models;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup implements CustomerComponent {
    private final List<CustomerComponent> customers = new ArrayList<>();

    public void addCustomer(CustomerComponent customer) {
        customers.add(customer);
    }

    @Override
    public void buyShoeOnline(ShoeInterface shoe) {  // Updated parameter to ShoeInterface
        for (CustomerComponent customer : customers) {
            customer.buyShoeOnline(shoe);
        }
    }

    @Override
    public void buyShoeInStore(ShoeInterface shoe) {  // Updated parameter to ShoeInterface
        for (CustomerComponent customer : customers) {
            customer.buyShoeInStore(shoe);
        }
    }
}
