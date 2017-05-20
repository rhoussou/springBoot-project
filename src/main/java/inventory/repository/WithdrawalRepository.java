package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Withdrawal;

public interface WithdrawalRepository extends MongoRepository<Withdrawal, String>, QueryDslPredicateExecutor<Withdrawal> {

}
