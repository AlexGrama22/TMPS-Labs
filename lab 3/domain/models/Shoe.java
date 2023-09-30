package domain.models;

public class Shoe implements ShoeInterface { // Updated this line
    private String brand;
    private int size;
    private String type;
    private double price;
    private int stockCount;

    public Shoe(String brand, int size, String type, double price, int stockCount) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.price = price;
        this.stockCount = stockCount;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", stockCount=" + stockCount +
                '}';
    }
}
