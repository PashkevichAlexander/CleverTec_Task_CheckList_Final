package task.repository.impl;

import task.entity.Item;
import task.repository.Repository;
import task.repository.db.DatabaseConnectionProvider;
import task.service.Reader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class DatabaseRepository implements Repository {

    @Override
    public Optional<Item> find(int id) {
        try(Connection connection = DatabaseConnectionProvider.getConnection()) {
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("""
                    select
                    """);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return Optional.empty();
    }
}
