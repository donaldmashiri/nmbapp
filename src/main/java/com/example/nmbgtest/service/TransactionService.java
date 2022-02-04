package com.example.nmbgtest.service;

import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.entity.Customer;
import com.example.nmbgtest.entity.Transaction;
import com.example.nmbgtest.repository.CustomerRepository;
import com.example.nmbgtest.repository.TransationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransationRepository repository;


    public Transaction saveTransaction(Transaction transaction) {
        return  repository.save(transaction);
    }

    public List<Transaction> getTransactions() {
        return  repository.findAll();
    }

    public List<Transaction> saveTransactions(List<Transaction> transactions) {
        return repository.saveAll(transactions);
    }


    public String deleteTransaction(Long id) {
        repository.deleteById(id);
        return "Transaction removed !! " + id;
    }

    public Transaction updateTransaction(Transaction transaction) {
        Transaction existingTransaction = repository.findById(transaction.getId()).orElse(null);
        existingTransaction.setCreditTransaction(transaction.getCreditTransaction());
        existingTransaction.setDebitTransaction(transaction.getDebitTransaction());
        existingTransaction.setCustomer(transaction.getCustomer());
        existingTransaction.setDebitTransaction(transaction.getDebitTransaction());
        return repository.save(existingTransaction);
    }


}
