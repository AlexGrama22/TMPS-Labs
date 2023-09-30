package domain.models;

public class ShoeBuilder {
    private String brand;
    private int size;
    private String type;
    private double price;
    private int stockCount;

    public ShoeBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ShoeBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public ShoeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ShoeBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ShoeBuilder setStockCount(int stockCount) {
        this.stockCount = stockCount;
        return this;
    }

    public Shoe build() {
        return new Shoe(brand, size, type, price, stockCount);
    }
}
