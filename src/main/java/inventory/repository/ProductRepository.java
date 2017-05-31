package inventory.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Product;

public interface ProductRepository extends MongoRepository<Product, String>, QueryDslPredicateExecutor<Product> {
	
	Product findById(String id);
	
	@Query(value = "{category.name:?0}")
	List<Product> findByCategory(String category);
}
