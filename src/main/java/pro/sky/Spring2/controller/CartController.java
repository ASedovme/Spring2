package pro.sky.Spring2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring2.service.CartService;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        cartService.addAll(ids);
        return cartService.get();

    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();

    }

}
