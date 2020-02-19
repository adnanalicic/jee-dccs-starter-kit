/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package projection;

import java.util.Date;

/**
 * EquipmentProjection
 *
 * <p>A Java object which represents equipment data sent from or to the client.
 */
public class EquipmentProjection {
  private Integer id_;
  private String model_;
  private String serialNumber_;
  private Date invoiceDate_;
  private Date warrantyDate_;
  private EmployeeProjection employee_;
  private MetaDataProjection type_;
  private MetaDataProjection manufactor_;
  // FIXME: do we need the ids?
  private Integer employeeId_;
  // FIXME: do we need the ids?
  private Integer equipmentTypeId_;
  // FIXME: do we need the ids?
  private Integer manufactorId_;

  public Integer getId() {
    return id_;
  }

  public String getModel() {
    return model_;
  }

  public void setModel(String model) {
    this.model_ = model;
  }

  public String getSerialNumber() {
    return serialNumber_;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber_ = serialNumber;
  }

  public void setId(Integer id_) {
    this.id_ = id_;
  }

  public EmployeeProjection getEmployee() {
    return employee_;
  }

  public void setEmployee(EmployeeProjection employee) {
    this.employee_ = employee;
  }

  public Date getInvoiceDate() {
    return invoiceDate_;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate_ = invoiceDate;
  }

  public Date getWarrantyDate() {
    return warrantyDate_;
  }

  public void setWarrantyDate(Date warrantyDate) {
    this.warrantyDate_ = warrantyDate;
  }

  public MetaDataProjection getType() {
    return type_;
  }

  public void setType(MetaDataProjection type) {
    this.type_ = type;
  }

  public MetaDataProjection getManufactor() {
    return manufactor_;
  }

  public void setManufactor(MetaDataProjection manufactor) {
    this.manufactor_ = manufactor;
  }

  public Integer getEmployeeId() {
    return employeeId_;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId_ = employeeId;
  }

  public Integer getEquipmentTypeId() {
    return equipmentTypeId_;
  }

  public void setEquipmentTypeId(Integer equipmentTypeId) {
    this.equipmentTypeId_ = equipmentTypeId;
  }

  public Integer getManufactorId() {
    return manufactorId_;
  }

  public void setManufactorId(Integer manufactorId) {
    this.manufactorId_ = manufactorId;
  }
}
