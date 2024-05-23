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

import java.util.List;

@RestController

public class UserController {

    @GetMapping("/string")
    public ResponseEntity<String> findByID() {
        return new ResponseEntity<>("this.userService. findByID(id)", HttpStatus.ACCEPTED);
    }
}
