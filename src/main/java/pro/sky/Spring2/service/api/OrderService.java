package pro.sky.Spring2.service.api;

import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}
