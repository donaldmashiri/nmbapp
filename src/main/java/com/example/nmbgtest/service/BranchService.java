package com.example.nmbgtest.service;

import com.example.nmbgtest.entity.Branch;
import com.example.nmbgtest.entity.Customer;
import com.example.nmbgtest.repository.BranchRepository;
import com.example.nmbgtest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public Branch saveBranch(Branch branch){
        return  branchRepository.save(branch);
    }

    public List<Branch> getBranches(){

        return  branchRepository.findAll();

    }

    public List<Branch> saveBranches(List<Branch> branches) {
        return  branchRepository.saveAll(branches);
    }

    public Branch updateBranch(Branch branch) {
        Branch existingBranch = branchRepository.findById(branch.getId()).orElse(null);
        existingBranch.setBranch_name(branch.getBranch_name());

        return branchRepository.save(existingBranch);

    }

    public String deleteBranch(Long id) {
        branchRepository.deleteById(id);
        return "Branch removed !! " + id;
    }
}
