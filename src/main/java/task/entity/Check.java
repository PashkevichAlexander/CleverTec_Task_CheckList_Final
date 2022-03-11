package task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Check {
    private Map<Item, Integer> map;
    private double total;
    private double totalSum;
    private double discount;
}
