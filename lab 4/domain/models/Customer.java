package domain.models;

public class Customer implements OnlineBuyer, InStoreBuyer, CustomerComponent {    private final String name;
    private final String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public void buyShoeOnline(ShoeInterface shoe) {
        System.out.println(name + " bought a " + shoe + " online.");
    }

    public void buyShoeInStore(ShoeInterface shoe) {
        System.out.println(name + " bought a " + shoe + " in-store.");
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }

    public void notify(String message) {
        System.out.println(name + " received notification: " + message);
    }


}