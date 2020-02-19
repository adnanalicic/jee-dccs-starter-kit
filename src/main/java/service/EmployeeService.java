/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package service;

import java.util.List;
import javax.inject.Inject;
import mapper.EmployeeMapper;
import projection.EmployeeProjection;
import repository.EmployeeRepository;

/**
 * UserService
 *
 * <p>Class for manipulating Equipment resources on the server
 */
public class EmployeeService {
  @Inject private EmployeeRepository employeeRepository_;

  public List<EmployeeProjection> getEmployeeList() {
    return EmployeeMapper.asProjections(employeeRepository_.getEmployeeList());
  }
}
