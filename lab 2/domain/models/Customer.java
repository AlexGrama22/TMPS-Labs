package domain.models;

public class Customer implements OnlineBuyer, InStoreBuyer {
    private final String name;
    private final String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public void buyShoeOnline(Shoe shoe) {
        System.out.println(name + " bought a shoe online.");
    }

    @Override
    public void buyShoeInStore(Shoe shoe) {
        System.out.println(name + " bought a shoe in-store.");
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}
