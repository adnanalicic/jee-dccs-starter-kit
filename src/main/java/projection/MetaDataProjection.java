/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package projection;

/**
 * MetaDataProjection
 *
 * <p>A Java object which represents meta data sent from or to the client.
 */
public class MetaDataProjection {

  private Integer id_;

  private String category_;

  private String value_;

  public MetaDataProjection(Integer id, String category, String value) {
    this.id_ = id;
    this.category_ = category;
    this.value_ = value;
  }

  public MetaDataProjection() {}

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
