package domain.command;

import domain.models.CustomerComponent;
import domain.models.ShoeInterface;

public class BuyCommand {
    private final CustomerComponent customer;
    private final ShoeInterface shoe;

    public BuyCommand(CustomerComponent customer, ShoeInterface shoe) {
        this.customer = customer;
        this.shoe = shoe;
    }

    public void executeOnline() {
        customer.buyShoeOnline(shoe);
    }

    public void executeInStore() {
        customer.buyShoeInStore(shoe);
    }
}
