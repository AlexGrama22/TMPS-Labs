package domain.discount;

public class Discount {
    public void applyDiscount(String customerName, double discountPercentage) {
        System.out.println(customerName + " received a " + discountPercentage + "% discount.");
    }
}
