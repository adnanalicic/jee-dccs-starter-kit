/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package entity;

import java.util.Date;
import javax.persistence.*;

/**
 * EquipmentEntity
 *
 * <p>A JPA entity which describes how equipment data is stored in a database
 */
@Entity
@Table(name = "T_EQUIPMENT")
public class EquipmentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Integer id_;

  @Column(name = "MODEL")
  private String model_;

  @Column(name = "SERIAL_NUMBER")
  private String serialNumber_;

  @Column(name = "INVOICE_DATE")
  private Date invoiceDate_;

  @Column(name = "WARRANTY_DATE")
  private Date warrantyDate_;

  @OneToOne private EmployeeEntity employee_;

  @OneToOne private MetaDataEntity type_;

  @OneToOne private MetaDataEntity manufactor_;

  public Date getWarrantyDate() {
    return warrantyDate_;
  }

  public void setWarrantyDate(Date warrantyDate) {
    this.warrantyDate_ = warrantyDate;
  }

  public Date getInvoiceDate() {
    return invoiceDate_;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate_ = invoiceDate;
  }

  public String getSerialNumber() {
    return serialNumber_;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber_ = serialNumber;
  }

  public String getModel() {
    return model_;
  }

  public void setModel(String model) {
    this.model_ = model;
  }

  public Integer getId() {
    return id_;
  }

  public void setId(Integer id) {
    this.id_ = id;
  }

  public EmployeeEntity getEmployee() {
    return this.employee_;
  }

  public void setEmployee(EmployeeEntity employee) {
    this.employee_ = employee;
  }

  public MetaDataEntity getType() {
    return this.type_;
  }

  public void setType(MetaDataEntity type) {
    this.type_ = type;
  }

  public MetaDataEntity getManufactor() {
    return this.manufactor_;
  }

  public void setManufactor(MetaDataEntity manufactor) {
    this.manufactor_ = manufactor;
  }
}
