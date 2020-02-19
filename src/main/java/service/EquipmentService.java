/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package service;

import entity.EmployeeEntity;
import entity.EquipmentEntity;
import java.util.List;
import javax.inject.Inject;
import mapper.EquipmentMapper;
import projection.EquipmentProjection;
import repository.EmployeeRepository;
import repository.EquipmentRepository;
import repository.MetaDataRepository;

/** Class for manipulating Equipment resources on the server */
public class EquipmentService {
  @Inject private EquipmentRepository equipmentRepository_;

  @Inject private EmployeeRepository employeeRepository_;

  @Inject private MetaDataRepository metaDataRepository_;

  public List<EquipmentProjection> getEquipmentList() {
    return EquipmentMapper.asProjections(equipmentRepository_.getEquipmentList());
  }

  public EquipmentProjection getEquipmentById(Integer id) {
    return EquipmentMapper.asProjection(equipmentRepository_.getEquipmentById(id));
  }

  public void createEquipment(EquipmentProjection equipmentProjection) {
    mergeEquipment(equipmentProjection, new EquipmentEntity());
  }

  public void updateEquipment(EquipmentProjection equipmentProjection, Integer equipmentId) {
    EquipmentEntity entity = equipmentRepository_.getEquipmentById(equipmentId);
    mergeEquipment(equipmentProjection, entity);
  }

  private void mergeEquipment(EquipmentProjection equipmentProjection, EquipmentEntity entity) {
    Integer employeeId = equipmentProjection.getEmployeeId();
    EmployeeEntity employee = null;
    if (employeeId != null) {
      employee = employeeRepository_.getEmployeeById(employeeId);
    }

    entity.setEmployee(employee);
    entity.setManufactor(
        metaDataRepository_.getMetaDataById(equipmentProjection.getManufactor().getId()));
    entity.setType(metaDataRepository_.getMetaDataById(equipmentProjection.getType().getId()));

    entity.setModel(equipmentProjection.getModel());
    entity.setSerialNumber(equipmentProjection.getSerialNumber());

    entity.setInvoiceDate(equipmentProjection.getInvoiceDate());
    entity.setWarrantyDate(equipmentProjection.getWarrantyDate());
    equipmentRepository_.persistEquipmentEntity(entity);
  }
}
