package domain.factory;

import domain.models.Shoe;

public class ShoeFactory {
    public Shoe createShoe(String brand, int size, String type, double price, int stockCount) {
        return new Shoe(brand, size, type, price, stockCount);
    }
}
