package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeEntity
 *
 * <p>A JPA entity which describes how Employees are stored in a database
 */
@Entity
@Table(name = "T_EMPLOYEE")
public class EmployeeEntity {

  public EmployeeEntity(Integer id) {
    this.id_ = id;
  }

  public EmployeeEntity() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Integer id_;

  @Column(name = "NAME")
  private String name_;

  public Integer getId() {
    return this.id_;
  }

  public void setId(Integer id) {
    this.id_ = id;
  }

  public String getName() {
    return this.name_;
  }

  public void setName(String name) {
    this.name_ = name;
  }
}
