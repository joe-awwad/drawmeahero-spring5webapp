package leo.spring5webapp.drawmeahero.services;

import leo.spring5webapp.drawmeahero.command.PlaceOrderCommand;
import leo.spring5webapp.drawmeahero.model.HeroOrder;

public interface PlaceOrderService {

    HeroOrder placeOrder(PlaceOrderCommand order);

}
