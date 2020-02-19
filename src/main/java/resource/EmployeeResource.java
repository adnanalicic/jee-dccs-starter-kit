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
import projection.EmployeeProjection;
import service.EmployeeService;

/** REST resource for managing employees. */
@Stateless
@Path("employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {
  @Inject private EmployeeService employeeService_;

  @GET
  public List<EmployeeProjection> getEmployeeList() {
    return employeeService_.getEmployeeList();
  }
}
