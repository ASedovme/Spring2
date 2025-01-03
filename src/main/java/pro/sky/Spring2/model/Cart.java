package pro.sky.Spring2.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Data
@Component
@SessionScope
@RequiredArgsConstructor
public class Cart {
    private final List<Integer> goods;

    public Integer add(Integer id) {
        goods.add(id);
        return id;
    }

    public List<Integer> getAll() {
        return new ArrayList<>(goods);
    }


}
