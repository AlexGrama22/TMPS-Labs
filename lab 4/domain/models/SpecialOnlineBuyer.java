package domain.models;

import domain.strategy.DiscountStrategy;

public class SpecialOnlineBuyer extends Customer {
    private DiscountStrategy discountStrategy;

    public SpecialOnlineBuyer(String name, String email) {
        super(name, email);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void applyDiscount() {
        if (discountStrategy != null) {
            discountStrategy.applyDiscount();
        } else {
            System.out.println("No discount strategy set.");
        }
    }
}
