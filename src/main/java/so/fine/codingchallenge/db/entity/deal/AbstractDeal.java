package so.fine.codingchallenge.db.entity.deal;

import jakarta.persistence.*;
import so.fine.codingchallenge.db.entity.lead.Lead;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Ensures separate tables for subclasses
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
    private Lead lead; // Associated Lead
}
