package net.burda.inpia.cv03.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IssueReport {

  @Id
  @GeneratedValue
  private Long id;

  private String description;
  private String url;

  public IssueReport(){
  }
  public IssueReport(String url, String description){
    this.url = url;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
