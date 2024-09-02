package ru.pugovishnikova.testspringproject.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.pugovishnikova.testspringproject.DTO.UserDTO;
import ru.pugovishnikova.testspringproject.controllers.UserController;
import ru.pugovishnikova.testspringproject.mappers.UserMapper;
import ru.pugovishnikova.testspringproject.model.User;
import ru.pugovishnikova.testspringproject.servicies.impl.UserServiceImpl;

import java.util.UUID;

@RestController
public class UserControllerImpl implements UserController {

    UserMapper mapper;
    UserServiceImpl service;

    @Autowired
    public UserControllerImpl(UserMapper mapper, UserServiceImpl service) {
        this.mapper = mapper;
        this.service = service;
    }


    @Override
    public UserDTO getUserDTOByID(UUID id) {
       User responseUser = service.getUserById(id);
       return mapper.converUserToUserDTO(responseUser);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User responseUser = service.createUser(mapper.converUserDTOToUser(userDTO));
        return mapper.converUserToUserDTO(responseUser);
    }

}
