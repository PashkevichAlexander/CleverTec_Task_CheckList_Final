//package task.service;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import task.entity.Basket;
//import task.entity.Item;
//import task.repository.Repository;
//
//import java.util.Map;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.when;
//import static task.service.data.BasketServiceTestData.*;
//
//class BasketServiceTest {
//
//    private BasketService basketService;
//
//
//    @BeforeEach
//    public void before() {
//        Repository repository = Mockito.mock(Repository.class);
//        basketService = new BasketService(repository);
//
//        when(repository.find(getId())).thenReturn(Optional.of(getItem()));
//    }
//
//
//    @Test
//    public void addOrder_Item_Exist() {
//        Basket basket = getAnyBasket();
//
//        basketService.addOrder(getId(), getNumbers(), basket);
//
//        assertTrue(basket.getItems().containsKey(getItem()));
//    }
//
//    @Test
//    public void findInBasket_ItemId_FindSuccessfully() {
//        Basket basket = getAnyBasket();
//        basket.setItems(Map.of(getItem(), getNumbers()));
//
//        Item key = basketService.findInBasket(getId(), basket);
//
//        assertTrue(basket.getItems().containsKey(key));
//    }
//
//    @Test
//    public void removeOrder_ItemId_FindSuccessfully() {
//        Basket basket = getAnyBasket();
//        basket.setItems(Map.of(getItem(), getNumbers()));
//
//        basketService.removeOrder(getId(), basket);
//
//        assertNull(basketService.findInBasket(getId(), basket));
//    }
//}