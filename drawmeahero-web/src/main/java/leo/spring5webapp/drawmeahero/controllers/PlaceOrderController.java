package leo.spring5webapp.drawmeahero.controllers;

import leo.spring5webapp.drawmeahero.model.HeroOrder;
import leo.spring5webapp.drawmeahero.services.PlaceOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceOrderController {

    private final PlaceOrderService placeOrderService;

    public PlaceOrderController(PlaceOrderService placeOrderService) {
        this.placeOrderService = placeOrderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<HeroOrder> placeOrder(@RequestBody HeroOrder order) {
        return ResponseEntity.ok(this.placeOrderService.placeOrder(order));
    }
}
