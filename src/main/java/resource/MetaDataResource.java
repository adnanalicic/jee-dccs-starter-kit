/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package resource;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import projection.MetaDataProjection;
import service.MetaDataService;

/** REST resource for managing meta data. */
@Stateless
@Path("metaData")
@Produces(MediaType.APPLICATION_JSON)
public class MetaDataResource {
  @Inject private MetaDataService metaDataService_;

  @GET
  @Path("/{category}")
  public List<MetaDataProjection> getMetaDataList(@PathParam("category") String category) {
    return metaDataService_.getMetaData(category);
  }
}
