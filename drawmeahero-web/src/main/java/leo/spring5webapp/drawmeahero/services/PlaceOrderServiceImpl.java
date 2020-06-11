package leo.spring5webapp.drawmeahero.services;

import leo.spring5webapp.drawmeahero.controllers.DmahRequest;
import leo.spring5webapp.drawmeahero.controllers.DmahRequestAdapter;
import leo.spring5webapp.drawmeahero.model.HeroOrder;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Override
    public HeroOrder placeOrder(DmahRequest request) {
        return DmahRequestAdapter.adapt(request);
    }
}
