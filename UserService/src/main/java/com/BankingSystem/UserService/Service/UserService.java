package com.BankingSystem.UserService.Service;

import com.BankingSystem.UserService.Entity.User;
import com.BankingSystem.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }
}
