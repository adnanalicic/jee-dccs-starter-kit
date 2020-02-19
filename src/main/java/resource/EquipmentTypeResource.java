/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package resource;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import projection.MetaDataProjection;
import service.MetaDataService;

/** REST resource for managing equipmentType data. */
@Stateless
@Path("equipmentType")
@Produces(MediaType.APPLICATION_JSON)
public class EquipmentTypeResource {
  @Inject private MetaDataService metaDataService_;

  @GET
  public List<MetaDataProjection> getMetaDataList() {
    return metaDataService_.getMetaData(MetaDataService.EQUIPMENT_TYPE);
  }
}
