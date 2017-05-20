package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Taxonomy;

public interface TaxonomyRepository extends MongoRepository<Taxonomy, String>, QueryDslPredicateExecutor<Taxonomy> {

}
