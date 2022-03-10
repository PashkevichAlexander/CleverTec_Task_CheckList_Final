package singleton;

import task.entity.Basket;
import task.entity.DiscountCard;

public class BasketSingleton {
    private static BasketSingleton instance;
    private final Basket basket;

    private BasketSingleton(DiscountCard discountCard) {
        basket = new Basket(discountCard);
    }

    //basket not dependent by discount card
    //getInstance should be getInstance()
    public static BasketSingleton getInstance(DiscountCard discountCard){
        if(instance == null){
            instance = new BasketSingleton(discountCard);
        }
        return instance;
    }

    public Basket getBasket() {
        return basket;
    }
}
