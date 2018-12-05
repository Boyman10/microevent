package net.rhm.microuser.service;

import net.rhm.microuser.config.Sender;
import net.rhm.microuser.entity.User;
import net.rhm.microuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Value("${spring.kafka.topic.userCreated}")
    private static String USER_CREATED_TOPIC;

    private UserRepository userRepository;
    private Sender sender;

    @Override
    public User registerUser(User input) {
        User createdUser = userRepository.save(input);
        sender.send(USER_CREATED_TOPIC, createdUser);
        return createdUser;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
