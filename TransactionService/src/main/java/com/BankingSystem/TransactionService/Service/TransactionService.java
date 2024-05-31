package com.BankingSystem.TransactionService.Service;

import com.BankingSystem.TransactionService.Entity.Transaction;
import com.BankingSystem.TransactionService.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction( Transaction transaction){
        transaction.setTransactionDate(new Date());
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByFromAccountId(Long fromAccountId) {
        return transactionRepository.findByFromAccountId(fromAccountId);
    }

    public List<Transaction> getTransactionsByToAccountId(Long toAccountId) {
        return transactionRepository.findByToAccountId(toAccountId);
    }
}
