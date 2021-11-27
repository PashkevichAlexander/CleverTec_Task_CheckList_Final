package task.service;

import task.entity.Basket;
import task.entity.DiscountsState;
import task.repository.Repository;

import java.util.Date;
import java.util.stream.Collectors;

public class CheckService {
    private final Repository repository;

    public CheckService(Repository repository) {
        this.repository = repository;
    }

    public String createCheck(Basket basket) {
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
        return line + newLine +
                "SuperMarket 123" + newLine +
                new Date() + newLine +
                line + newLine +
                String.format("%-10s %-10s %-10s %-10s", "number", "name", "cost", "totalCost") + newLine +
                createItemList(basket) + newLine +
                line + newLine +
                "Total = " + total + newLine +
                "TO PAY = " + totalSum + newLine +
                "Discount = " + discount;
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

