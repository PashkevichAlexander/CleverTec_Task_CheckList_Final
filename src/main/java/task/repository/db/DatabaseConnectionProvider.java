package task.repository.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionProvider {
    private static final String url = "jdbc:mysql://localhost:3306/shopOrder";
    private static final String user = "root";
    private static final String password = "12345";


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException sqlEx) {
            String text = String.format("\n User ={url: %s, user: %s, password: %s}",url,user,password);
            throw new RuntimeException("can't creat connection" + text,sqlEx);
        }
    }
}
