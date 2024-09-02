package ru.pugovishnikova.testspringproject.servicies;
import java.util.UUID;

import ru.pugovishnikova.testspringproject.model.User;

public interface UserService {


    User getUserById(UUID userId);

    User createUser(User user);
}
