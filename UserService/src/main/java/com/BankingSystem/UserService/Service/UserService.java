package com.BankingSystem.UserService.Service;

import com.BankingSystem.UserService.Entity.User;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> findByUsername(String username);
}
