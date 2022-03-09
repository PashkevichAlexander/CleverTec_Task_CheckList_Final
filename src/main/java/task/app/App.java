package task.app;

import task.entity.Basket;
import task.entity.DiscountCard;
import task.repository.impl.XMLRepository;
import task.service.BasketService;
import task.service.CheckService;
import task.service.FileWriter;
import task.service.Reader;


public class App {
//    private static final String FILEPATH = "src/main/resources/repository.xml";
//    private static final String MENU = """
//            1 - AddItem(index,number)
//            2 - remove(index)
//            3 - Buy
//            """;
//
//    public void run() {
//        DiscountCard discountCard = new DiscountCard();
//        Basket basket = new Basket(discountCard);
//
//        XMLRepository repository = new XMLRepository(FILEPATH);
//
//        CheckService checkService = new CheckService(repository);
//        BasketService basketService = new BasketService(repository);
//
//        FileWriter fileWriter = new FileWriter();
//        Reader reader = new Reader();
//
//        while (true) {
//            System.out.println(MENU);
//            int choose = reader.readInt();
//            switch (choose) {
//                case 1 -> {
//                    int itemId = reader.readInt();
//                    int quantity = reader.readInt();
//                    basketService.addOrder(itemId, quantity, basket);
//                }
//                case 2 -> {
//                    int itemId = reader.readInt();
//                    basketService.removeOrder(itemId, basket);
//                }
//                case 3 -> {
//                    System.out.println("do you have a discount card(true,false):");
//                    boolean discount = reader.readBool();
//                    discountCard.setId(discount);
//                    basket.setCard(discountCard);
//                    System.out.println(checkService.createCheck(basket));
//                    checkService.createCheck(basket);
//                    fileWriter.write(checkService.createCheck(basket));
//
//                    return;
//                }
//            }
//        }
//    }
}
