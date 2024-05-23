package vn.fpt.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.fpt.identityservice.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
