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
    private Optional<DiscountCard> card;

    public Basket( ) {
        this.items = new HashMap<>();
    }


}
