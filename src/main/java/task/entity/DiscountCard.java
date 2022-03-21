package task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountCard {
    private int id;
    private String typeOfDiscount;
    private int valueOfDiscount;
}
