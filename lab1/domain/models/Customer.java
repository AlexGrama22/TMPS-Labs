package domain.models;

public class Customer implements OnlineBuyer, InStoreBuyer {
    private String name;
    private String email;
    private Shoe shoePurchased;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void buyShoe(Shoe shoe) {
        this.shoePurchased = shoe;
    }

    public void returnShoe() {
        this.shoePurchased = null;
    }

    public String getName() {
        return name;
    }

    public Shoe getShoePurchased() {
        return shoePurchased;
    }
    @Override
    public void buyShoeOnline(Shoe shoe) {
        this.shoePurchased = shoe;
        System.out.println(name + " bought a shoe online.");
    }

    @Override
    public void buyShoeInStore(Shoe shoe) {
        this.shoePurchased = shoe;
        System.out.println(name + " bought a shoe in-store.");
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", shoePurchased=" + (shoePurchased != null ? shoePurchased : "None") +
                '}';
    }



    // ... any other methods or setters you might need
}
