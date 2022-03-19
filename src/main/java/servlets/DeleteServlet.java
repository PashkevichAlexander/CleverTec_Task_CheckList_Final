package servlets;

import task.singleton.BasketSingleton;
import task.repository.impl.DatabaseRepository;
import task.service.BasketService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    private final BasketSingleton basketSingleton = BasketSingleton.getInstance();
    private final DatabaseRepository databaseRepository = new DatabaseRepository();
    private final BasketService basketService = new BasketService(databaseRepository);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/indexToDelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int itemId = Integer.parseInt(req.getParameter("deleteId"));
        basketService.removeOrder(itemId,basketSingleton.getBasket());
        req.getRequestDispatcher("/WEB-INF/view/indexToDelete.jsp").forward(req, resp);
    }
}
