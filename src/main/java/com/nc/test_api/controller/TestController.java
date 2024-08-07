package com.nc.test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nc.test_api.domain.Custommer;
import com.nc.test_api.service.CustomerService;

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

}
