package com.example.nmbgtest.controller;


import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @GetMapping("/accounts")
    public List<Account> findAllAccounts() {
        return accountService.getAccounts();

    }

    @PostMapping("/addAccounts")
    public List<Account> addAccounts(@RequestBody List<Account> accounts) {
        return accountService.saveAccounts(accounts);
    }

    @PutMapping("/updateAccount")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable Long id) {
        return accountService.deleteAccount(id);
    }


}
