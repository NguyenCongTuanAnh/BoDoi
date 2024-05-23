package vn.fpt.identityservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "users", schema = "identity_db", catalog = "")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "full_name")
    private String fullName;


}


