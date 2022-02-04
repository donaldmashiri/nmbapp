package com.example.nmbgtest.service;

import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.entity.Branch;
import com.example.nmbgtest.repository.AccountRepository;
import com.example.nmbgtest.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return  accountRepository.save(account);
    }

    public List<Account> getAccounts() {
        return  accountRepository.findAll();
    }

    public List<Account> saveAccounts(List<Account> accounts) {
        return  accountRepository.saveAll(accounts);
    }

    public Account updateAccount(Account account) {
        Account existingAccount = accountRepository.findById(account.getId()).orElse(null);
        existingAccount.setAccountNumber(account.getAccountNumber());
        existingAccount.setActiveBalance(account.getActiveBalance());
        existingAccount.setIntialBalance(account.getIntialBalance());
        existingAccount.setBranch(account.getBranch());
        existingAccount.setCreditBalance(account.getCreditBalance());
        existingAccount.setCreditNarration(account.getCreditNarration());
        existingAccount.setDebitBalance(account.getDebitBalance());
        existingAccount.setDebitNarration(account.getDebitNarration());
        existingAccount.setCurrency(account.getCurrency());
        existingAccount.setCustomer(account.getCustomer());
        existingAccount.setDateOfCreation(account.getDateOfCreation());
        existingAccount.setMobileNumber(account.getMobileNumber());
        existingAccount.setBranch(account.getBranch());

        return accountRepository.save(existingAccount);
    }

    public String deleteAccount(Long id) {
        accountRepository.deleteById(id);
        return "Account removed !! " + id;
    }
}
