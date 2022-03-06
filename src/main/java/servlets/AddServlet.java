package servlets;

import Singleton.BasketSingleton;
import task.service.BasketService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    BasketSingleton basketSingleton = BasketSingleton.getInstance();
    BasketService basketService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToAdd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post method here!!!");

        int itemId = Integer.parseInt(req.getParameter("char"));
        int quantity = Integer.parseInt(req.getParameter("char"));
        basketService.addOrder(itemId, quantity, basketSingleton.getBasket());


        req.getRequestDispatcher("/WEB-INF/view/indexToAdd.jsp").forward(req,resp);
    }
}
