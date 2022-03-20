package task.repository.impl;

import task.entity.Item;
import task.entity.NewDiscountCard;
import task.exception.DatabaseRepositoryException;
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
            throw new DatabaseRepositoryException("a", throwables);
        }
        return Optional.empty();
    }

    public Optional<NewDiscountCard> findDiscount(int id) {

        try (Connection connection = DatabaseConnectionProvider.getConnection()) {
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("""
                    select * from userDiscountId
                    """);

            while (resultSet.next()) {
                if (resultSet.getInt(2) == id) {
                    final Statement statement1 = connection.createStatement();
                    final ResultSet resultSet1 = statement1.executeQuery("""
                            select * from discountCard
                            """);
                    while (resultSet1.next()) {
                        if (resultSet.getInt(1) == resultSet1.getInt(1)) {
                            NewDiscountCard newDiscountCard = new NewDiscountCard(
                                    resultSet1.getInt(1),
                                    resultSet1.getString(2),
                                    resultSet1.getInt(3));
                            return Optional.of(newDiscountCard);
                        }
                    }
                }
            }
        } catch (SQLException throwables) {
            throw new DatabaseRepositoryException("can't find Discount ID", throwables);
        }
        return Optional.empty();
    }
}
