package ru.pugovishnikova.testspringproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.pugovishnikova.testspringproject.DTO.UserDTO;

import java.util.UUID;

@RequestMapping("/users")
public interface UserController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    UserDTO getUserDTOByID(@PathVariable UUID id);

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    UserDTO createUser(@RequestBody UserDTO userDTO);
}
