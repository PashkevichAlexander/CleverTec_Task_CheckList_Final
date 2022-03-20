package task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor

public class Basket {
    private Map<Item, Integer> items;
    //move card to another
    private Optional<NewDiscountCard> card;

    public Basket( ) {
        this.items = new HashMap<>();
    }
}
