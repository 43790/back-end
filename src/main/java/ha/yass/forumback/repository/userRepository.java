package ha.yass.forumback.repository;

import ha.yass.forumback.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface userRepository extends CrudRepository<User, Integer> {

   // List<User> findByAgeAndByCreatedAt(int age ,int createdAt);

}
