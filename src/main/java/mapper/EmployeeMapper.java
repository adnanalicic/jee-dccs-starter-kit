/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package mapper;

import entity.EmployeeEntity;
import java.util.List;
import java.util.stream.Collectors;
import projection.EmployeeProjection;

/**
 * EmployeeMapper
 *
 * <p>A convenience class to convert between {@link EmployeeEntity} and {@link EmployeeProjection}
 */
public class EmployeeMapper {
  private EmployeeMapper() {}

  /**
   * Converts a {@link EmployeeEntity} to {@link EmployeeProjection}
   *
   * @param entity
   * @return
   */
  public static EmployeeProjection asProjection(EmployeeEntity entity) {
    EmployeeProjection projection = new EmployeeProjection();
    projection.setId(entity.getId());
    projection.setValue(entity.getName());
    return projection;
  }

  /**
   * Converts a list of {@link EmployeeEntity} objects to list of {@link EmployeeProjection} objects
   *
   * @param entities
   * @return
   */
  public static List<EmployeeProjection> asProjections(List<EmployeeEntity> entities) {
    return entities.stream().map(EmployeeMapper::asProjection).collect(Collectors.toList());
  }
}
