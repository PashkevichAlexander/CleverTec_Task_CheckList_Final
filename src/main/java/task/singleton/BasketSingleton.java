package task.singleton;

import task.entity.Basket;




public class BasketSingleton {
    private static BasketSingleton instance;
    private final Basket basket;

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
}
