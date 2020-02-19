/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package service;

import java.util.List;
import javax.inject.Inject;
import mapper.MetaDataMapper;
import projection.MetaDataProjection;
import repository.MetaDataRepository;

/**
 * MetaDataService
 *
 * <p>Class for manipulating MetaData resources on the server
 */
public class MetaDataService {

  public static final String EQUIPMENT_TYPE = "equipmentType";
  public static final String MANUFACTOR = "manufactor";

  @Inject
  private MetaDataRepository metaDataRepository_;

  public List<MetaDataProjection> getMetaData(String category) {
    return MetaDataMapper.asProjections(metaDataRepository_.getMetaData(category));
  }
}
