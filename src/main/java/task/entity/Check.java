package task.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Check {
    Map<Item, Integer> itemListForCheck;
    double total;
    double totalSum;
    double discount;
}
