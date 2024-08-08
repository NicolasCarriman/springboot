package com.nc.test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nc.test_api.domain.Custommer;
import com.nc.test_api.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/api/v1/customer")
public class TestController {

    @Autowired
    private final CustomerService customerService;

    public TestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Custommer> getTest() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void postCustomer(@RequestBody Custommer customer) {
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path="{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId) {
        customerService.removeCustomer(customerId);
    }
  
} 
