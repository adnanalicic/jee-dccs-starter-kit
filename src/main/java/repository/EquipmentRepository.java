/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package repository;

import entity.EquipmentEntity;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * EquipmentRepository
 *
 * <p>Equipment Database Interface
 */
public class EquipmentRepository {
  @Inject private EntityManager entityManager_;

  public List<EquipmentEntity> getEquipmentList() {
    List<EquipmentEntity> result =
        entityManager_
            .createQuery(
                "select e from EquipmentEntity e left join fetch e.employee_ em left join fetch e.type_ left join fetch e.manufactor_")
            .getResultList();

    return result;
  }

  public EquipmentEntity getEquipmentById(Integer id) {
    return entityManager_.find(EquipmentEntity.class, id);
  }

  public void persistEquipmentEntity(EquipmentEntity entity) {
    entityManager_.persist(entity);
  }
}
