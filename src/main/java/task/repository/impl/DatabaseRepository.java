package task.repository.impl;

import task.entity.Item;
import task.repository.Repository;
import task.repository.db.DatabaseConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class DatabaseRepository implements Repository {

    @Override
    public Optional<Item> find(int id) {
        try (Connection connection = DatabaseConnectionProvider.getConnection()) {
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("""
                    select * from basketOrder
                    """);
            while (resultSet.next()) {
                if (resultSet.getInt(1) == id) {
                    final int itemId = resultSet.getInt(1);
                    final String itemName = resultSet.getString(2);
                    final int itemCost = resultSet.getInt(3);
                    final String itemDiscount = resultSet.getString(4);
                    Item item = new Item(itemId, itemName, itemCost, itemDiscount);
                    return Optional.of(item);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return Optional.empty();
    }
}
