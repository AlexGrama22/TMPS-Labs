package domain.models;

public class LimitedEditionShoeDecorator extends ShoeDecorator {

    public LimitedEditionShoeDecorator(Shoe decoratedShoe) {
        super(decoratedShoe);
    }

    @Override
    public String toString() {
        return super.toString() + " [Limited Edition]";
    }
}
