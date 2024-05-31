package com.BankingSystem.AccountService.Service;

import com.BankingSystem.AccountService.Entity.Account;
import com.BankingSystem.AccountService.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAccountsByUserId(Long userId){
        return accountRepository.findByUserId(userId);
    }

    public Account getAccountById(Long accountId){
        return accountRepository.findById(accountId).orElse(null);
    }
}
