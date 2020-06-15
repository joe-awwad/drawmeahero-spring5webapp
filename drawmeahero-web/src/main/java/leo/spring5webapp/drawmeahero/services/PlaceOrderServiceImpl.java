package leo.spring5webapp.drawmeahero.services;

import leo.spring5webapp.drawmeahero.model.HeroOrder;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Override
    public HeroOrder placeOrder(HeroOrder order) {
        return order;
    }
}
