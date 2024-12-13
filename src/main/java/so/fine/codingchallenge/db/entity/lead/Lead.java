package so.fine.codingchallenge.db.entity.lead;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import so.fine.codingchallenge.db.entity.deal.AbstractDeal;
import so.fine.codingchallenge.db.entity.user.User;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lead{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String firstname;
        String lastname;
        String address;
        String city;
        String zipCode;
        String phoneNumber;
        String email;
        @ManyToOne User user;
}

