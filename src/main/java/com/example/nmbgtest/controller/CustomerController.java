package com.example.nmbgtest.controller;

import com.example.nmbgtest.service.CustomerService;
import com.example.nmbgtest.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {

        return customerService.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return customerService.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/CustomerById/{id}")
    public Customer findCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/Customer/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return customerService.getCustomerByName(name);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    public static class AccountController {
    }
}
