package vn.fpt.identityservice.dto;


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
