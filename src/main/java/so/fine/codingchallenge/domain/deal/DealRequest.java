package so.fine.codingchallenge.domain.deal;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DealRequest {
    private String type; // "A" or "B"
    private String name;
    private String description;
    private Long userId;
    private String status; // NEW, IN_PROGRESS, CLOSED
    private Double amountInvolved;

    // DealA-specific fields
    private List<Double> withdrawals;
    private List<Double> deposits;


    // DealB-specific fields
    private Double grossSalary;
    private LocalDate contractStartDate;
}
