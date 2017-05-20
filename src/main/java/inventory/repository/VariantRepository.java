package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Variant;

public interface VariantRepository extends MongoRepository<Variant, String>, QueryDslPredicateExecutor<Variant> {

}
