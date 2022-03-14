package task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor

public class Basket {
    private Map<Item, Integer> items;
    //move card to another
    private DiscountCard card;

    public Basket( ) {
        this.items = new HashMap<>();
    }
}
