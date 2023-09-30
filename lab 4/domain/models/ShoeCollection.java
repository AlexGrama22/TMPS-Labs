package domain.models;

import java.util.Iterator;
import java.util.List;

public class ShoeCollection implements Iterable<ShoeInterface> {
    private List<ShoeInterface> shoes;

    public ShoeCollection(List<ShoeInterface> shoes) {
        this.shoes = shoes;
    }

    @Override
    public Iterator<ShoeInterface> iterator() {
        return shoes.iterator();
    }
}
