package pro.sky.Spring2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.Spring2.model.Cart;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final Cart cart;

    public void addAll(List<Integer> ids) {
        ids.forEach(cart::add);
    }

    public List<Integer> get() {
        return cart.getAll();
    }
}
