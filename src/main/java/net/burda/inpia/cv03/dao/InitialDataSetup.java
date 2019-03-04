package net.burda.inpia.cv03.dao;

import javax.annotation.PostConstruct;
import net.burda.inpia.cv03.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitialDataSetup {

  @Autowired
  IssueRepository issueRepository;

  @PostConstruct
  public void addSomeIssues(){
    issueRepository.save(new IssueReport("test1", "test2"));
    issueRepository.save(new IssueReport("testOlaaa", "testBalaa"));
  }

}
