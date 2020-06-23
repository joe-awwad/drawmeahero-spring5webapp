package leo.spring5webapp.drawmeahero.services;

import leo.spring5webapp.drawmeahero.HeroOrderRepository;
import leo.spring5webapp.drawmeahero.command.PlaceOrderCommand;
import leo.spring5webapp.drawmeahero.converters.PlaceOrderCommandToHeroOrder;
import leo.spring5webapp.drawmeahero.model.HeroOrder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@AllArgsConstructor
@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    private final HeroOrderRepository heroOrderRepository;

    @Override
    public HeroOrder placeOrder(PlaceOrderCommand order) {
        return this.heroOrderRepository.save(Objects.requireNonNull(new PlaceOrderCommandToHeroOrder().convert(order)));
    }
}
