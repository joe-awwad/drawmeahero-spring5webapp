package leo.spring5webapp.drawmeahero.services;

import leo.spring5webapp.drawmeahero.controllers.DmahRequest;
import leo.spring5webapp.drawmeahero.model.HeroOrder;

public interface PlaceOrderService {

    HeroOrder placeOrder(DmahRequest request);

}
