package task.service.data;

import task.entity.Basket;
import task.entity.DiscountCard;
import task.entity.DiscountsState;
import task.entity.Item;

import java.util.Set;


public class BasketServiceTestData {
    public static Item getItem() {
        return new Item(1, "milk", 10, Set.of(DiscountsState.DISCOUNT_ALLOWED));
    }

    public static Basket getAnyBasket() {
        DiscountCard discountCard = new DiscountCard();
        return new Basket(discountCard);
    }

    public static int getId() {
        return 1;
    }

    public static int getNumbers() {
        return 3;
    }
}
