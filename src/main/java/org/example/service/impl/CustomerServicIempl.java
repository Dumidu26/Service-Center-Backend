package org.example.service.impl;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServicIempl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> getCustomers() {

        return customerRepository.findAll();
    }

//
//    @Override
//    public List<Customer> getCustomers() {
//        ArrayList<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer(1,"dsd","sdfs558"));
//        customerList.add(new Customer(1,"dsd","sdfs558"));
//        customerList.add(new Customer(1,"dsd","sdfs558"));
//        customerList.add(new Customer(1,"dsd","sdfs558"));
//        customerList.add(new Customer(1,"dsd","sdfs558"));
//
//        return customerList;
//    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void deleteCustomerById(Integer id) {

    }


}
