package domain.service;

import domain.models.InStoreBuyer;
import domain.models.OnlineBuyer;
import domain.models.ShoeInterface;  // Make sure to import the renamed interface

public interface BuyingServiceInterface {
    void buyOnline(OnlineBuyer buyer, ShoeInterface shoe);  // Updated the parameter type
    void buyInStore(InStoreBuyer buyer, ShoeInterface shoe);  // Updated the parameter type
}
