package com.example.nmbgtest.repository;

import com.example.nmbgtest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByFirstName(String id);

    interface AccountRepository {

    }
}
