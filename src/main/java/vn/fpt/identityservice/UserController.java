package vn.fpt.identityservice;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.fpt.identityservice.dto.UserDTO;
import vn.fpt.identityservice.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<UserDTO> toUserDTO() {
        return ResponseEntity.ok().body(this.userService.toUserDTO());
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> findAll() {
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/findById")
    public ResponseEntity<UserDTO> findByID(@RequestParam int id) {
        return new ResponseEntity<>(this.userService. findByID(id), HttpStatus.ACCEPTED);
    }
}
