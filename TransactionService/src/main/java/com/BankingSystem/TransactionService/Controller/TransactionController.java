package com.BankingSystem.TransactionService.Controller;

import com.BankingSystem.TransactionService.Entity.Transaction;
import com.BankingSystem.TransactionService.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.createTransaction(transaction), HttpStatus.CREATED);
    }

    @GetMapping("/from/{fromAccountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByFromAccountId(@PathVariable Long fromAccountId) {
        return new ResponseEntity<>(transactionService.getTransactionsByFromAccountId(fromAccountId), HttpStatus.OK);
    }

    @GetMapping("/to/{toAccountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByToAccountId(@PathVariable Long toAccountId) {
        return new ResponseEntity<>(transactionService.getTransactionsByToAccountId(toAccountId), HttpStatus.OK);
    }
}
