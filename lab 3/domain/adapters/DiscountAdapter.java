package domain.adapters;

import domain.discount.Discount;
import domain.models.SpecialOnlineBuyer;

public class DiscountAdapter {
    private final Discount discount;

    public DiscountAdapter(Discount discount) {
        this.discount = discount;
    }

    public void apply(SpecialOnlineBuyer buyer, double discountPercentage) {
        discount.applyDiscount(buyer.getName(), discountPercentage);
    }
}
