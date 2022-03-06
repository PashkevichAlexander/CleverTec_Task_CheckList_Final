package Singleton;

import task.entity.Basket;
import task.entity.DiscountCard;

public class BasketSingleton {
    private static BasketSingleton instance;
    private Basket basket;

    private BasketSingleton(DiscountCard discountCard) {
        basket = new Basket(discountCard);
    }

    public static BasketSingleton getInstance(DiscountCard discountCard){
        if(instance == null){
            instance = new BasketSingleton(discountCard);
        }
        return instance;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
