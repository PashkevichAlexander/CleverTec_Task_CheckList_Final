package task.service;

import singleton.BasketSingleton;
import task.entity.Basket;
import task.entity.Check;
import task.entity.DiscountsState;


public class CheckService {
    private final BasketSingleton basketSingleton = BasketSingleton.getInstance();

    public CheckService() {
    }

    public Check createCheck(Basket basket) {
        double totalSum;
        double total = calculateTotal(basket);
        if (basket.getCard().isId()) {
            totalSum = calculateToPay(basket);
        } else {
            totalSum = total;
        }
        double discount = total - totalSum;
        return new Check(basketSingleton.getBasket().getItems(),total,totalSum,discount);
    }

    private double calculateTotal(Basket basket) {
        return basket.getItems()
                .entrySet()
                .stream()
                .mapToDouble(entry -> entry.getKey().getCost() * entry.getValue())
                .sum();
    }

    private double calculateToPay(Basket basket) {
        return basket.getItems()
                .entrySet()
                .stream()
                .mapToDouble(entry -> {
                    double cost = entry.getKey().getCost() * entry.getValue();
                    if (entry.getKey().getDiscounts().contains(DiscountsState.DISCOUNT_ALLOWED)) {
                        return cost - cost / 10;
                    }
                    return cost;
                })
                .sum();
    }

}

