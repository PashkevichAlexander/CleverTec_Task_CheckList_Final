package servlets;

import singleton.BasketSingleton;
import task.entity.Check;
import task.entity.DiscountCard;
import task.repository.impl.XMLRepository;
import task.service.CheckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuyServlet extends HttpServlet {
    private static final String FILEPATH = "src/main/resources/repository.xml";

    private final DiscountCard discountCard = new DiscountCard(true);
    private final BasketSingleton basketSingleton = BasketSingleton.getInstance(discountCard);
    private final XMLRepository xmlRepository = new XMLRepository(FILEPATH);
    private final CheckService checkService = new CheckService(xmlRepository);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToBuy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Check check = checkService.createCheck(basketSingleton.getBasket());
        req.setAttribute("check", check);
        req.getRequestDispatcher("/WEB-INF/view/indexToCheck.jsp").forward(req, resp);
    }
}
