package so.fine.codingchallenge.db.entity.deal;

import jakarta.persistence.Entity;
import so.fine.codingchallenge.db.entity.deal.AbstractDeal;

import java.time.LocalDate;

@Entity
public class DealB extends AbstractDeal {
    private Double grossSalary;
    private LocalDate contractStartDate;
}
