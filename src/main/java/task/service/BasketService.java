package task.service;

import task.entity.Basket;
import task.entity.Item;
import task.repository.Repository;

import java.util.Optional;

public class BasketService {
    private final Repository repository;

    public BasketService(Repository repository) {
        this.repository = repository;
    }

    public void addOrder(int id, int numbers, Basket basket) {
        Optional<Item> optionalItem = repository.find(id);

        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            if (basket.getItems().containsKey(item)) {
                numbers += basket.getItems().get(item);
            }
            basket.getItems().put(item, numbers);
        } else {
            System.out.println("this id does not exist");
        }
    }

    public void removeOrder(int id, Basket basket) {
        basket.getItems().remove(findInBasket(id, basket));
    }

    public Item findInBasket(int id, Basket basket) {
        return basket
                .getItems()
                .keySet()
                .stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}