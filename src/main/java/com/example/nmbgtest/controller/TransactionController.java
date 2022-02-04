package com.example.nmbgtest.controller;


import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.entity.Transaction;
import com.example.nmbgtest.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;


    @PostMapping("/addTransaction")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping("/Transactions")
    public List<Transaction> findAllTransaction() {
        return transactionService.getTransactions();

    }

    @PostMapping("/addTransactions")
    public List<Transaction> addTransactions(@RequestBody List<Transaction> transactions) {
        return transactionService.saveTransactions(transactions);
    }


    @PutMapping("/updateTransaction")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }

    @DeleteMapping("/deleteTransaction/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        return transactionService.deleteTransaction(id);
    }


}
