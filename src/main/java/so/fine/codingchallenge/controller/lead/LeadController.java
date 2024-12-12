package so.fine.codingchallenge.controller.lead;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import so.fine.codingchallenge.domain.lead.LeadResponse;
import so.fine.codingchallenge.service.lead.LeadService;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {
    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @GetMapping
    public ResponseEntity<List<LeadResponse>> getAllLeads() {
        if (leadService.getAllLeads() == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(leadService.getAllLeads());
    }


}
