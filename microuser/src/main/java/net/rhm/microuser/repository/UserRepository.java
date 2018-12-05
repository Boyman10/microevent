package net.rhm.microuser.repository;

import net.rhm.microuser.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
