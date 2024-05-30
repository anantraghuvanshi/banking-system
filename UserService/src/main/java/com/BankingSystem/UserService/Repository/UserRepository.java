package com.BankingSystem.UserService.Repository;

import com.BankingSystem.UserService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByName(String userName);
}
