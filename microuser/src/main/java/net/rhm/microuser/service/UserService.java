package net.rhm.microuser.service;

import net.rhm.microuser.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registerUser(User input);
    Iterable<User> findAll();
}

