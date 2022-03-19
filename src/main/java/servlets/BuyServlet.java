package servlets;

import task.singleton.BasketSingleton;
import task.entity.Check;
import task.entity.DiscountCard;
import task.service.CheckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuyServlet extends HttpServlet {
    private final BasketSingleton basketSingleton = BasketSingleton.getInstance();
    private final CheckService checkService = new CheckService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToBuy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String discountState = req.getParameter("discountState");

        DiscountCard discountCard = new DiscountCard(Boolean.parseBoolean(discountState));

        basketSingleton.getBasket().setCard(discountCard);

        Check check = checkService.createCheck(basketSingleton.getBasket());

        req.setAttribute("check", check);
        req.getRequestDispatcher("/WEB-INF/view/indexToCheck.jsp").forward(req, resp);
    }
}
