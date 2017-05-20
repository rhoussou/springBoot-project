package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Entry;

public interface EntryRepository extends MongoRepository<Entry, String>, QueryDslPredicateExecutor<Entry> {

}
