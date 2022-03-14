package task.service.data;

import singleton.BasketSingleton;
import task.entity.Basket;
import task.entity.DiscountsState;
import task.entity.Item;

import java.util.Set;


public class BasketServiceTestData {
    public static Item getItem() {
        return new Item(1, "milk", 10, Set.of(DiscountsState.DISCOUNT_ALLOWED));
    }

    public static Basket getAnyBasket() {
        BasketSingleton basketSingleton = BasketSingleton.getInstance();
        return basketSingleton.getBasket();
    }

    public static int getId() {
        return 1;
    }

    public static int getNumbers() {
        return 3;
    }
}
