package com.example.nmbgtest.repository;

import com.example.nmbgtest.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    Branch save(Branch branch);

}
