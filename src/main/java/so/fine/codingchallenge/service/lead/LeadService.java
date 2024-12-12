package so.fine.codingchallenge.service.lead;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import so.fine.codingchallenge.db.entity.lead.Lead;
import so.fine.codingchallenge.domain.lead.LeadRequest;
import so.fine.codingchallenge.domain.lead.LeadResponse;
import so.fine.codingchallenge.repository.lead.LeadRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LeadService {
    private final LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    public List<LeadResponse> getAllLeads() {
        return leadRepository.findAll().stream().
                map(LeadResponse::toLeadResponse).
                toList();
    }

    public Optional<LeadResponse> getLeadById(Long id) {
        return leadRepository.findById(id).map(LeadResponse::toLeadResponse);
    }

    public LeadResponse createLead(LeadRequest leadRequest) {
        Lead newLead = leadRepository.save(LeadRequest.toLeadEntity(leadRequest));
        return LeadResponse.toLeadResponse(newLead);
    }
}
