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
            // Дописать url user and password
            throw new RuntimeException("can't creat connection",sqlEx);
        }
    }
}
