package com.example.nmbgtest.controller;


import com.example.nmbgtest.entity.Branch;
import com.example.nmbgtest.entity.Customer;
import com.example.nmbgtest.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("/addBranch")
    public Branch addBranch(@RequestBody Branch branch) {
        return branchService.saveBranch(branch);
    }

    @GetMapping("/branches")
    public List<Branch> findAllBranches() {
        return branchService.getBranches();

    }

    @PostMapping("/addBranches")
    public List<Branch> addBranches(@RequestBody List<Branch> branches) {
        return branchService.saveBranches(branches);
    }

    @PutMapping("/updateBranch")
    public Branch updateBranch(@RequestBody Branch branch) {
        return branchService.updateBranch(branch);
    }

    @DeleteMapping("/deleteBranch/{id}")
    public String deleteBranch(@PathVariable Long id) {
        return branchService.deleteBranch(id);
    }


}
