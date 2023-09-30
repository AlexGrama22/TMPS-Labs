package domain.service;

import domain.models.*;

public class BuyingService implements BuyingServiceInterface {
    private static BuyingService instance;

    private BuyingService() {}

    public static BuyingService getInstance() {
        if (instance == null) {
            instance = new BuyingService();
        }
        return instance;
    }

    @Override
    public void buyOnline(OnlineBuyer buyer, ShoeInterface shoe) {  // Updated the parameter type
        buyer.buyShoeOnline(shoe);
    }

    @Override
    public void buyInStore(InStoreBuyer buyer, ShoeInterface shoe) {  // Updated the parameter type
        buyer.buyShoeInStore(shoe);
    }
}
