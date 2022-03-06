package Singleton;

import task.entity.DiscountCard;

public class DiscountCardSingleton {
    private static DiscountCardSingleton discountCardSingleton;
    private DiscountCard discountCard;

    private DiscountCardSingleton(){
        discountCard = new DiscountCard();
    }

    public static DiscountCardSingleton getDiscountCardSingleton() {
        if (discountCardSingleton == null){
            discountCardSingleton = new DiscountCardSingleton();
        }
        return discountCardSingleton;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }
}
