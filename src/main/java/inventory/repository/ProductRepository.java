package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Product;

public interface ProductRepository extends MongoRepository<Product, String>, QueryDslPredicateExecutor<Product> {

}
