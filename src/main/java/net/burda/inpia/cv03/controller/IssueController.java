package net.burda.inpia.cv03.controller;

import net.burda.inpia.cv03.dao.IssueReport;
import net.burda.inpia.cv03.repositories.IssueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IssueController {

  IssueRepository issueRepository;

  public IssueController(IssueRepository issueRepository) {
    this.issueRepository = issueRepository;
  }

  @GetMapping("/issuereport")
  public String getResponse(Model model) {
    model.addAttribute("issueReport", new IssueReport());
    return "issues/issuereport_form";
  }

  @PostMapping("/issuereport")
  public String issueReportSubmit(IssueReport issueReport, Model model){
    IssueReport result = this.issueRepository.save(issueReport);
    model.addAttribute("submitted", true);
    model.addAttribute("issueReport", result);
    System.out.println("Submitted..." + issueReport.getDescription());
    return "redirect:/issuereport";
  }

  @GetMapping("/issues")
  public String getIssues(Model model) {
    model.addAttribute("issues", this.issueRepository.findAllButPrivate());
    return "issues/issuereport_list";
  }
}
