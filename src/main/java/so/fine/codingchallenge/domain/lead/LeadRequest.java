package so.fine.codingchallenge.domain.lead;

import lombok.Data;
import so.fine.codingchallenge.db.entity.lead.Lead;

@Data
public class LeadRequest {
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String email;

    public LeadRequest(Long id, String firstname, String lastname, String address, String city, String zipCode, String phoneNumber, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static Lead toLeadEntity(LeadRequest leadRequest) {
        Lead lead = new Lead();
        lead.setFirstname(leadRequest.getFirstname());
        lead.setLastname(leadRequest.getLastname());
        lead.setAddress(leadRequest.getAddress());
        lead.setCity(leadRequest.getCity());
        lead.setZipCode(leadRequest.getZipCode());
        lead.setPhoneNumber(leadRequest.getPhoneNumber());
        lead.setEmail(leadRequest.getEmail());
        return lead;
    }
}
