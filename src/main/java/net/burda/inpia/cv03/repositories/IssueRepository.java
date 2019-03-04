package net.burda.inpia.cv03.repositories;

import java.util.List;
import net.burda.inpia.cv03.dao.IssueReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IssueRepository extends JpaRepository<IssueReport, Long>{

  @Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
  List<IssueReport> findAllButPrivate();

  List<IssueReport> findByDescription(String description);

}