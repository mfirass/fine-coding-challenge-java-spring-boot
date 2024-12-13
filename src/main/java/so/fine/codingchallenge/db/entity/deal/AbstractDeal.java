package so.fine.codingchallenge.db.entity.deal;

import jakarta.persistence.*;
import lombok.Data;
import so.fine.codingchallenge.db.entity.user.User;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Ensures separate tables for subclasses
@Data
public abstract class AbstractDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double amountInvolved;

    @Enumerated(EnumType.STRING)
    private DealStatus status; // Enum for status

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Associated Lead
}
