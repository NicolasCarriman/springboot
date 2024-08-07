package com.nc.test_api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.test_api.domain.Custommer;
import com.nc.test_api.reporsitory.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = null;
    }

    @Autowired //facilita las injections y agrega el setter
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Custommer> getCustomers() {
        return customerRepository.findAll(); 
    }

}
