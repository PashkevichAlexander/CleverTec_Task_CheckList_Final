package Singleton;

import task.entity.Basket;

public class BasketSingleton {
    private static BasketSingleton instance;
    private Basket basket;

    private BasketSingleton() {
        basket = new Basket();
    }

    public static BasketSingleton getInstance(){
        if(instance == null){
            instance = new BasketSingleton();
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
