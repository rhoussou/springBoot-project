package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Entries;

public interface EntriesRepository extends MongoRepository<Entries, String>, QueryDslPredicateExecutor<Entries> {

}
