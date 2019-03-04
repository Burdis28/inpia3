package net.burda.inpia.cv03.controller;

import java.util.List;

import net.burda.inpia.cv03.dao.IssueReport;
import net.burda.inpia.cv03.repositories.IssueRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/issues")
public class IssueRestController {

  IssueRepository issueRepository;

  public IssueRestController(IssueRepository issueRepository) {
    this.issueRepository = issueRepository;
  }

  @GetMapping
  public List<IssueReport> getIssues() {
    return this.issueRepository.findAll();
  }
}