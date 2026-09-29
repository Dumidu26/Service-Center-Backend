package org.example.controller.customer;

import lombok.RequiredArgsConstructor;
import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {


    final CustomerService service;


//    CustomerService service;
 //   CustomerRepository customerRepository;
//    CustomerController(CustomerService service,CustomerRepository  customerrepository){
//         this.service = service;
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

    @PostMapping("/addCustomerlist")
    public void addCustomerListOneTime(@RequestBody List<Customer> customers){
        service.addCustomer(customers);
    }


    @PutMapping
    public void updatecustomer(@RequestBody  Customer customer){
        service.addCustomer(customer);
    }


    public void customerDelete(){

    }

    @GetMapping("/get-customer")
    public Customer getCustomerss(){

        return null;
    }


}
