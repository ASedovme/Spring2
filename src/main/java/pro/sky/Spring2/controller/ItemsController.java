package pro.sky.Spring2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring2.service.api.OrderService;

import java.util.List;
@RestController
@RequestMapping("/order")

public class ItemsController {
    private final OrderService orderService;

    public ItemsController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> idList) {
        return orderService.addItems(idList);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
