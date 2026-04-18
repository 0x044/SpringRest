package dharun.spring.models;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CashCard {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private double amount;
}
