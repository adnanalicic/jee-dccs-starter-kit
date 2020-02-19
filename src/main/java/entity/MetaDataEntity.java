package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MetaDataEntity
 *
 * <p>A JPA entity which describes how meta data is stored in a database
 */
@Entity
@Table(name = "T_META_DATA")
public class MetaDataEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Integer id_;

  @Column(name = "CATEGORY")
  private String category_;

  @Column(name = "VALUE")
  private String value_;

  public Integer getId() {
    return this.id_;
  }

  public void setId(Integer id) {
    this.id_ = id;
  }

  public String getCategory() {
    return this.category_;
  }

  public void setCategory(String category) {
    this.category_ = category;
  }

  public String getValue() {
    return this.value_;
  }

  public void setValue(String value) {
    this.value_ = value;
  }
}
