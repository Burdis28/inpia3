package net.burda.inpia.cv03.repositories;

import static org.junit.Assert.*;

import java.util.Optional;
import javax.transaction.Transactional;
import net.burda.inpia.cv03.controller.IssueController;
import net.burda.inpia.cv03.dao.IssueReport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class IssueRepositoryTest {

  @Autowired
  IssueRepository issueRepository;

  @Test
  public void testSave(){
    IssueReport report = new IssueReport();
    report.setDescription("Olalaa");
    report.setUrl("uiii");
    issueRepository.save(report);

    Long id = report.getId();
    assertNotNull(report.getId());

    Optional<IssueReport> fromDb = issueRepository.findById(id);
    assertEquals(fromDb.get().getDescription(), "Olalaa");

  }

  @Test
  @Transactional
  public void testGetByDescription(){

    IssueReport report = new IssueReport();
    report.setDescription("test1");
    report.setUrl("testurl1");
    issueRepository.save(report);

    IssueReport report2 = new IssueReport();
    report.setDescription("test2");
    report.setUrl("testurl2");
    issueRepository.save(report2);

    IssueReport report3 = new IssueReport();
    report.setDescription("test2");
    report.setUrl("testurl2");
    issueRepository.save(report3);

    assertEquals(1, issueRepository.findByDescription("test1").size());
    assertEquals(2, issueRepository.findByDescription("test2").size());

  }
}