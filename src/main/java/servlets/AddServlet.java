package servlets;

import singleton.BasketSingleton;
import task.entity.DiscountCard;
import task.repository.impl.XMLRepository;
import task.service.BasketService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    private static final String FILEPATH = "src/main/resources/repository.xml";

    private final BasketSingleton basketSingleton = BasketSingleton.getInstance();
    private final XMLRepository xmlRepository = new XMLRepository(FILEPATH);
    private final BasketService basketService = new BasketService(xmlRepository);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToAdd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer itemId = Integer.valueOf(req.getParameter("itemId"));
        Integer quantity = Integer.valueOf(req.getParameter("quantity"));
        //sout -> logger
        System.out.println(itemId);
        System.out.println(quantity);
        basketService.addOrder(itemId, quantity, basketSingleton.getBasket());


        req.getRequestDispatcher("/WEB-INF/view/indexToAdd.jsp").forward(req,resp);
    }
}
