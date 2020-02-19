/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package repository;

import entity.EmployeeEntity;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * EmployeeRepository
 *
 * <p>Employee data database interface
 */
public class EmployeeRepository {
  @Inject private EntityManager entityManager_;

  public List<EmployeeEntity> getEmployeeList() {
    return entityManager_.createQuery("select e from EmployeeEntity e").getResultList();
  }

  public EmployeeEntity getEmployeeById(Integer employeeId) {
    return entityManager_.find(EmployeeEntity.class, employeeId);
  }
}
