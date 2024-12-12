package so.fine.codingchallenge.db.entity.deal;

import jakarta.persistence.Entity;
import so.fine.codingchallenge.db.entity.deal.AbstractDeal;

@Entity
public class DealA extends AbstractDeal {
    private Double withdrawals;
    private Double deposits;
}
