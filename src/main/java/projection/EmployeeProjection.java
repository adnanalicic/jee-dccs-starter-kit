/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package projection;

/**
 * EmployeeProjection
 *
 * <p>A Java object which represents Employee data sent from or to the client.
 */
public class EmployeeProjection {
  private Integer id_;
  private String value_;

  public EmployeeProjection(Integer id, String value) {
    this.id_ = id;
    this.value_ = value;
  }

  public EmployeeProjection() {}

  public Integer getId() {
    return id_;
  }

  public void setId(Integer id_) {
    this.id_ = id_;
  }

  public String getValue() {
    return this.value_;
  }

  public void setValue(String value) {
    this.value_ = value;
  }
}
