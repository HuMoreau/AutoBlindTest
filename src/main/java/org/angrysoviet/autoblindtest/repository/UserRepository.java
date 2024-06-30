package org.angrysoviet.autoblindtest.repository;

import org.angrysoviet.autoblindtest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
