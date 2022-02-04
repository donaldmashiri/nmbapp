package com.example.nmbgtest.service;

import com.example.nmbgtest.entity.Customer;
import com.example.nmbgtest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer){
        return  repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> Customers){
        return  repository.saveAll(Customers);
    }

    public List<Customer> getCustomers(){
        return  repository.findAll();
    }


    public Customer getCustomerById(Long id){
        return  repository.findById(id).orElse(null);
    }

    public Customer getCustomerByName(String name){
        return  repository.findCustomerByFirstName(name);
    }

    public String deleteCustomer(Long id) {
        repository.deleteById(id);
        return "Customer removed !! " + id;
    }

    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setSurname(customer.getSurname());
        existingCustomer.setNationalID(customer.getNationalID());
        existingCustomer.setTitle(customer.getTitle());
        existingCustomer.setHomeowner(customer.getHomeowner());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setCreationdate(customer.getCreationdate());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setUsername(customer.getUsername());

        return repository.save(existingCustomer);
    }
    
}
