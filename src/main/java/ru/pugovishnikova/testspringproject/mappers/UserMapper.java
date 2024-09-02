package ru.pugovishnikova.testspringproject.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.pugovishnikova.testspringproject.DTO.UserDTO;
import ru.pugovishnikova.testspringproject.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", source = "id", ignore = true)
    User converUserDTOToUser(UserDTO userDTO);
    UserDTO converUserToUserDTO(User user);
}
