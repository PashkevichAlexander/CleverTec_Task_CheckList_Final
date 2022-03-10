package task.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Check {
    //use modificators
    Map<Item, Integer> map;
    double total;
    double totalSum;
    double discount;
}
