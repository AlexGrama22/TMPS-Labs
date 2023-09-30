package domain.service;

import domain.models.InStoreBuyer;
import domain.models.OnlineBuyer;
import domain.models.ShoeInterface;  // Corrected import

public class BuyingServiceProxy implements BuyingServiceInterface {
    private final BuyingService buyingService;

    public BuyingServiceProxy() {
        this.buyingService = BuyingService.getInstance();
    }

    @Override
    public void buyOnline(OnlineBuyer buyer, ShoeInterface shoe) {  // Corrected parameter type
        System.out.println("Processing online purchase...");
        buyingService.buyOnline(buyer, shoe);
    }

    @Override
    public void buyInStore(InStoreBuyer buyer, ShoeInterface shoe) {  // Corrected parameter type
        System.out.println("Processing in-store purchase...");
        buyingService.buyInStore(buyer, shoe);
    }
}
