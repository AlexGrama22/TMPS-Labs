package domain.models;

public class ShoeDecorator implements ShoeInterface {
    protected final Shoe decoratedShoe;

    public ShoeDecorator(Shoe decoratedShoe) {
        this.decoratedShoe = decoratedShoe;
    }

    @Override
    public String getBrand() {
        return decoratedShoe.getBrand();
    }

    @Override
    public int getSize() {
        return decoratedShoe.getSize();
    }

    @Override
    public String getType() {
        return decoratedShoe.getType();
    }

    @Override
    public double getPrice() {
        return decoratedShoe.getPrice();
    }

    @Override
    public int getStockCount() {
        return decoratedShoe.getStockCount();
    }

    @Override
    public String toString() {
        return decoratedShoe.toString();
    }
}
