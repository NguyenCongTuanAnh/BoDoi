package vn.fpt.identityservice.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.fpt.identityservice.dto.UserDTO;
import vn.fpt.identityservice.entity.User;
import vn.fpt.identityservice.mapper.UserMapper;
import vn.fpt.identityservice.repository.IUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

      UserMapper userMapper;
      IUserRepository userRepository;

    public List<UserDTO> findAll() {
        List<UserDTO> userDTOS = this.userRepository.findAll()
                .stream().map(userMapper :: toUserDTO)
                .collect(Collectors.toList());
        return userDTOS;
    }
    public UserDTO findByID(int id) {
        User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException(("User Not Found")));
        return this.userMapper.toUserDTO(user);
    }
    public UserDTO toUserDTO() {
        User user = User.builder()
                .userId(1)
                .username("TA")
                .email("JHNJA")
                .password("njancjsa")

                .build();
        User user1 = new User(1, "ada", "csdfs", "vsfsf", "caksdfds");
        return userMapper.toUserDTO(user1);
    }

}
