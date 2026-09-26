package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface CustomerService {

   // public Customer getCustomer();

    List<Customer> getCustomers();

    void addCustomer(Customer customer);

    void deleteCustomerById(Integer id);

    void addCustomer(List<Customer> customers);
}
