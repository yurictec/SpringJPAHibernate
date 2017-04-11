package test.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.project.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
