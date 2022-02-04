package com.example.nmbgtest.repository;

import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account save(Account account);
}
