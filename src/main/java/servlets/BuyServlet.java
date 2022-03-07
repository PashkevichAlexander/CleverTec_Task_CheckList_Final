package servlets;

import Singleton.BasketSingleton;
import task.entity.DiscountCard;
import task.repository.impl.XMLRepository;
import task.service.CheckService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BuyServlet", value = "/BuyServlet")
public class BuyServlet extends HttpServlet {

    private static final String FILEPATH = "src/main/resources/repository.xml";
    private DiscountCard discountCard = new DiscountCard(true);
    BasketSingleton basketSingleton = BasketSingleton.getInstance(discountCard);
    XMLRepository xmlRepository = new XMLRepository(FILEPATH);
    private CheckService checkService = new CheckService(xmlRepository);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToBuy.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String check = checkService.createCheck(basketSingleton.getBasket());
        req.setAttribute("check", check);
        System.out.println("this method is working");
        req.getRequestDispatcher("/WEB-INF/view/indexToBuy.jsp").forward(req,resp);
    }
}
