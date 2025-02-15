package ai.mago.base.auth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ai.mago.base.auth.model.User;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);

}
