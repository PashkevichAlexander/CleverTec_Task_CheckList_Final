package task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    private int id;
    private String name;
    private int cost;
    private Set<DiscountsState> discounts;

    public Item(int id, String name, int cost, String discounts) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.discounts = Set.of(DiscountsState.valueOf(discounts));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost, discounts);
    }
}
