package servlets;

import task.entity.Basket;

public class Singleton {
    private static Singleton instance;
    private Basket basket;

    private Singleton{
        basket = new Basket();
    }

}
