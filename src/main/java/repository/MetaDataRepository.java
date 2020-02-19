/*
 * Copyright (c) 2019 DCCS GmbH. All rights reserved.
 * Implemented 2019 by DCCS GmbH.
 */

package repository;

import entity.MetaDataEntity;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

/**
 * MetaDataRepository
 *
 * <p>MetaData Database Interface
 */
public class MetaDataRepository {
  @Inject private EntityManager entityManager_;

  public List<MetaDataEntity> getMetaData(String category) {
    CriteriaBuilder cb = entityManager_.getCriteriaBuilder();

    CriteriaQuery<MetaDataEntity> q = cb.createQuery(MetaDataEntity.class);
    Root<MetaDataEntity> c = q.from(MetaDataEntity.class);
    ParameterExpression<String> p = cb.parameter(String.class);
    q.select(c).where(cb.equal(c.get("category_"), p));

    TypedQuery<MetaDataEntity> query = entityManager_.createQuery(q);
    query.setParameter(p, category);
    return query.getResultList();
  }

  public MetaDataEntity getMetaDataById(Integer id) {
    return entityManager_.find(MetaDataEntity.class, id);
  }
}
