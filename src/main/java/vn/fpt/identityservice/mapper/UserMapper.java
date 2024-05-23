package vn.fpt.identityservice.mapper;

import org.mapstruct.Mapper;
import vn.fpt.identityservice.dto.UserDTO;
import vn.fpt.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser (UserDTO userDTO);
    UserDTO toUserDTO (User user);
}
