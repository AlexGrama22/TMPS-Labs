package domain.factory;

import domain.models.Shoe;
import domain.models.ShoeInterface;

public class ShoeFactory {
    public ShoeInterface createShoe(String brand, int size, String type, double price, int stockCount) {
        return new Shoe(brand, size, type, price, stockCount); // Ensure this returns ShoeInterface
    }
}
