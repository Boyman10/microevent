package net.rhm.microuser.service;

import net.rhm.microuser.entity.User;

public interface UserService {
    User registerUser(User input);
    Iterable<User> findAll();
}

