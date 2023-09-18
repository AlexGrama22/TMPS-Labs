package domain.models;

public class SpecialOnlineBuyer extends Customer {

    public SpecialOnlineBuyer(String name, String email) {
        super(name, email);
    }

    @Override
    public void buyShoeOnline(Shoe shoe) {
        super.buyShoeOnline(shoe);
        System.out.println(this.getName() + " received a special online discount.");
    }

}
