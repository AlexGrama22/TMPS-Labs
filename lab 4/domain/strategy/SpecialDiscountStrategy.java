package domain.strategy;

public class SpecialDiscountStrategy implements DiscountStrategy {

    @Override
    public void applyDiscount() {
        System.out.println("Applied a special discount!");
    }
}
