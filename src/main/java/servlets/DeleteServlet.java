package servlets;

import singleton.BasketSingleton;
import task.entity.DiscountCard;
import task.repository.impl.XMLRepository;
import task.service.BasketService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {


    private static final String FILEPATH = "src/main/resources/repository.xml";

    DiscountCard discountCard = new DiscountCard(true);

    BasketSingleton basketSingleton = BasketSingleton.getInstance(discountCard);
    XMLRepository xmlRepository = new XMLRepository(FILEPATH);
    BasketService basketService = new BasketService(xmlRepository);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToDelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int itemId = Integer.parseInt(req.getParameter("delete"));
        basketService.removeOrder(itemId,basketSingleton.getBasket());
        req.getRequestDispatcher("/WEB-INF/view/indexToDelete.jsp").forward(req, resp);
    }
}
