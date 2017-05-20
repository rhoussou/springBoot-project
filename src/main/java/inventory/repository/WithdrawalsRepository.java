package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Withdrawals;

public interface WithdrawalsRepository extends MongoRepository<Withdrawals, String>, 
QueryDslPredicateExecutor<Withdrawals> {

}
