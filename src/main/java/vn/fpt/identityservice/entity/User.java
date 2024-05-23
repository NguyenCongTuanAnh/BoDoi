package vn.fpt.identityservice.entity;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class User {

    private Integer userId;

    private String username;

    private String password;

    private String email;

    private String fullName;


}


