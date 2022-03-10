package task.service;

import singleton.BasketSingleton;
import task.entity.Basket;
import task.entity.Check;
import task.entity.DiscountCard;
import task.entity.DiscountsState;
import task.repository.Repository;

import java.util.stream.Collectors;

public class CheckService {
    private final Repository repository;
    private DiscountCard discountCard =  new DiscountCard();
    private BasketSingleton basketSingleton = BasketSingleton.getInstance(discountCard);

    public CheckService(Repository repository) {
        this.repository = repository;
    }
    private Check check = new Check();

    public Check createCheck(Basket basket) {
        double totalSum;
        String line = "-------------------------------------------";
        String newLine = "\n";
        double total = calculateTotal(basket);
        if (basket.getCard().isId()) {
            totalSum = calculateToPay(basket);
        } else {
            totalSum = total;
        }
        double discount = total - totalSum;
        check.setItemListForCheck(basketSingleton.getBasket().getItems());
        check.setTotal(total);
        check.setTotalSum(totalSum);
        check.setDiscount(discount);
        return check;
    }


    private String createItemList(Basket basket) {
        return basket.getItems()
                .entrySet()
                .stream()
                .map(entry -> {
                    int cost = entry.getKey().getCost() * entry.getValue();
                    int totalCost = cost;
                    if (basket.getCard().isId() && entry.getKey().getDiscounts().contains(DiscountsState.DISCOUNT_ALLOWED)) {
                        totalCost = cost - cost / 10;
                    }
                    return String.format("%-10s %-10s %-10s %-10s", entry.getValue(), entry.getKey().getName(), cost, totalCost);
                })
                .collect(Collectors.joining("\n"));

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

