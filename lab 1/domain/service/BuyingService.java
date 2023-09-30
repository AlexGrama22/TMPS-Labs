package domain.service;

import domain.models.*;

public class BuyingService {
    public void buyOnline(OnlineBuyer buyer, Shoe shoe) {
        buyer.buyShoeOnline(shoe);
    }

    public void buyInStore(InStoreBuyer buyer, Shoe shoe) {
        buyer.buyShoeInStore(shoe);
    }
}
