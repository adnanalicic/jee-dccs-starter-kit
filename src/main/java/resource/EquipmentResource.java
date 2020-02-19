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
import projection.EquipmentProjection;
import service.EquipmentService;

/** REST resource for managing Equipment data. */
@Stateless
@Path("equipment")
@Produces(MediaType.APPLICATION_JSON)
public class EquipmentResource {
  @Inject private EquipmentService equipmentService_;

  @GET
  public List<EquipmentProjection> getAllEquipment() {
    return equipmentService_.getEquipmentList();
  }

  @GET
  @Path("/{eqId}")
  public EquipmentProjection getEquipmentById(@PathParam("eqId") Integer eqId) {
    return equipmentService_.getEquipmentById(eqId);
  }

  @PUT
  @Path("/{eqId}")
  @Consumes(value = MediaType.APPLICATION_JSON)
  public void saveEquipment(@PathParam("eqId") Integer eqId, EquipmentProjection projection) {
    equipmentService_.updateEquipment(projection, eqId);
  }

  @POST
  @Consumes(value = MediaType.APPLICATION_JSON)
  public void createEquipment(EquipmentProjection projection) {
    equipmentService_.createEquipment(projection);
  }
}
