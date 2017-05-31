package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Category;

public interface CategoryRepository extends MongoRepository<Category, String>, QueryDslPredicateExecutor<Category> {

}
