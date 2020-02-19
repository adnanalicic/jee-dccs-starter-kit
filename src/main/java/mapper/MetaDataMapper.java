/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package mapper;

import entity.MetaDataEntity;
import java.util.List;
import java.util.stream.Collectors;
import projection.MetaDataProjection;

/**
 * MetaDataMapper
 *
 * <p>A convenience class to convert between {@link MetaDataEntity} and {@link MetaDataProjection}
 */
public class MetaDataMapper {
  private MetaDataMapper() {}

  /**
   * Converts a {@link MetaDataEntity} to {@link MetaDataProjection}
   *
   * @param entity
   * @return
   */
  public static MetaDataProjection asProjection(MetaDataEntity entity) {
    MetaDataProjection projection = new MetaDataProjection();
    projection.setId(entity.getId());
    projection.setValue(entity.getValue());
    projection.setCategory(entity.getCategory());
    return projection;
  }

  /**
   * Converts a list of MetaDataEntity objects to list of MetaDataProjection objects
   *
   * @param entities
   * @return
   */
  public static List<MetaDataProjection> asProjections(List<MetaDataEntity> entities) {
    return entities.stream().map(MetaDataMapper::asProjection).collect(Collectors.toList());
  }
}
