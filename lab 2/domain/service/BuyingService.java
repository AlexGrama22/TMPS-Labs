package domain.service;

import domain.models.*;

public class BuyingService {
    private static BuyingService instance;

    private BuyingService() {}

    public static BuyingService getInstance() {
        if (instance == null) {
            instance = new BuyingService();
        }
        return instance;
    }

    public void buyOnline(OnlineBuyer buyer, Shoe shoe) {
        buyer.buyShoeOnline(shoe);
    }

    public void buyInStore(InStoreBuyer buyer, Shoe shoe) {
        buyer.buyShoeInStore(shoe);
    }
}
