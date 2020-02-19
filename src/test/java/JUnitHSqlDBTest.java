import entity.MetaDataEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

public class JUnitHSqlDBTest {

  public static void main(String[] args) {
    Integer id = null;

    if (0 == id) {
      System.out.println("passed");
    }
  }

  public static void dummyTest() {
    EntityManager entityManager_ =
        Persistence.createEntityManagerFactory("dccs_test").createEntityManager();
    CriteriaBuilder cb = entityManager_.getCriteriaBuilder();

    CriteriaQuery<MetaDataEntity> q = cb.createQuery(MetaDataEntity.class);
    Root<MetaDataEntity> c = q.from(MetaDataEntity.class);
    ParameterExpression<String> p = cb.parameter(String.class);
    q.select(c).where(cb.equal(c.get("category_"), p));

    TypedQuery<MetaDataEntity> query = entityManager_.createQuery(q);
    query.setParameter(p, "manufactor");
    List<MetaDataEntity> results = query.getResultList();

    System.out.println("2");
  }
}
