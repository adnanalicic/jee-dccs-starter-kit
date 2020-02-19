/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package mapper;

import entity.EmployeeEntity;
import entity.EquipmentEntity;
import entity.MetaDataEntity;
import java.util.List;
import java.util.stream.Collectors;
import projection.EmployeeProjection;
import projection.EquipmentProjection;
import projection.MetaDataProjection;

/**
 * EquipmentMapper
 *
 * <p>A convenience class to convert between {@link EquipmentEntity} and {@link EquipmentProjection}
 */
public class EquipmentMapper {

  private EquipmentMapper() {}

  /**
   * Converts a {@link EquipmentEntity} to {@link EquipmentProjection}
   *
   * @param entity
   * @return
   */
  public static EquipmentProjection asProjection(EquipmentEntity entity) {
    EquipmentProjection projection = new EquipmentProjection();
    projection.setId(entity.getId());
    projection.setInvoiceDate(entity.getInvoiceDate());
    projection.setWarrantyDate(entity.getWarrantyDate());
    projection.setModel(entity.getModel());
    projection.setSerialNumber(entity.getSerialNumber());
    MetaDataEntity manufactor = entity.getManufactor();
    projection.setManufactor(
        new MetaDataProjection(
            manufactor.getId(), manufactor.getCategory(), manufactor.getValue()));
    MetaDataEntity type = entity.getType();
    projection.setType(new MetaDataProjection(type.getId(), type.getCategory(), type.getValue()));
    EmployeeEntity employeeEntity = entity.getEmployee();
    if (employeeEntity != null) {
      projection.setEmployee(
          new EmployeeProjection(employeeEntity.getId(), employeeEntity.getName()));
      projection.setEmployeeId(employeeEntity.getId());
    }
    projection.setEquipmentTypeId(type.getId());
    projection.setManufactorId(manufactor.getId());

    return projection;
  }

  /**
   * Converts a list of EquipmentEntity objects to list of EquipmentProjection objects
   *
   * @param entities
   * @return
   */
  public static List<EquipmentProjection> asProjections(List<EquipmentEntity> entities) {
    return entities.stream().map(EquipmentMapper::asProjection).collect(Collectors.toList());
  }
}
