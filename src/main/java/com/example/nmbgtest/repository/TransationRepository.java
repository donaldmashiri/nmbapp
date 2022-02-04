package com.example.nmbgtest.repository;

import com.example.nmbgtest.entity.Account;
import com.example.nmbgtest.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransationRepository extends JpaRepository<Transaction, Long> {

//    Transation save(Transation transation);

}
