package org.example.controller;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {

@Autowired
    CustomerService service;


//    @GetMapping("/get")
//    public Customer getCustomer(){
//
//        return service.getCustomer();
//    }


    @GetMapping("/get-customer")
    public List<Customer> getCustomers(){

        return service.getCustomers();
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Integer id){
        service.deleteCustomerById(id);

    }

    @PutMapping
    public void updatecustomer(@RequestBody  Customer customer){
        service.addCustomer(customer);
    }


    public void customerDelete(){

    }


}
