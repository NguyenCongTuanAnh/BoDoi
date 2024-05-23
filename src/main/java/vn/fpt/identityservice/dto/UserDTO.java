package vn.fpt.identityservice.dto;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private int userId;
    
    private String username;

    private String password;

    private String email;

    private String fullName;
}
