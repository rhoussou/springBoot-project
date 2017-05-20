package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Stock;

public interface StockRepository extends MongoRepository<Stock, String>, QueryDslPredicateExecutor<Stock> {

}
