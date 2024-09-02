package ru.pugovishnikova.testspringproject.servicies.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pugovishnikova.testspringproject.model.User;
import ru.pugovishnikova.testspringproject.repositories.UserRepository;
import ru.pugovishnikova.testspringproject.servicies.UserService;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public User getUserById(UUID userId) {
        return repository.getReferenceById(userId);
    }

    @Override
    @Transactional
    public User createUser(User user) {
        return repository.save(user);
    }
}
