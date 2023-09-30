package domain.models;

public class SpecialOnlineBuyer extends Customer {

    public SpecialOnlineBuyer(String name, String email) {
        super(name, email);
    }

    @Override
    public void buyShoeOnline(ShoeInterface shoe) { // Changed the parameter type to ShoeInterface
        super.buyShoeOnline(shoe);
        System.out.println(this.getName() + " received a special online discount for buying " + shoe);
    }
}
