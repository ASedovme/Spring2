package pro.sky.Spring2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.Spring2.model.Cart;
import pro.sky.Spring2.service.api.OrderService;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return List.of();
    }

    @Override
    public List<Integer> getItems() {
        return List.of();
    }
}
