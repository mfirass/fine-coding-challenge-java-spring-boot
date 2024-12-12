package so.fine.codingchallenge.service.lead;

import org.springframework.stereotype.Service;
import so.fine.codingchallenge.db.entity.lead.Lead;
import so.fine.codingchallenge.domain.lead.LeadResponse;
import so.fine.codingchallenge.repository.lead.LeadRepository;

import java.util.List;

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
}
