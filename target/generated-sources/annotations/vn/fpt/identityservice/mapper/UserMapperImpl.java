package vn.fpt.identityservice.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vn.fpt.identityservice.dto.UserDTO;
import vn.fpt.identityservice.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T22:28:41+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.userId( userDTO.getUserId() );
        user.username( userDTO.getUsername() );
        user.password( userDTO.getPassword() );
        user.email( userDTO.getEmail() );
        user.fullName( userDTO.getFullName() );

        return user.build();
    }

    @Override
    public UserDTO toUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        if ( user.getUserId() != null ) {
            userDTO.setUserId( user.getUserId() );
        }
        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setFullName( user.getFullName() );

        return userDTO;
    }
}
