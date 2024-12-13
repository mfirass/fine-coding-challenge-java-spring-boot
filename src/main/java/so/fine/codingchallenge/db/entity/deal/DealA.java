package so.fine.codingchallenge.db.entity.deal;

import jakarta.persistence.Entity;
import lombok.Data;
import so.fine.codingchallenge.db.entity.deal.AbstractDeal;

import java.util.List;

@Entity
@Data
public class DealA extends AbstractDeal {
    private List<Double> withdrawals;
    private List<Double> deposits;
}
