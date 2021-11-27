package task.repository;

import task.entity.Item;

import java.util.Optional;

public interface Repository {
    Optional<Item> find(int id);
}
