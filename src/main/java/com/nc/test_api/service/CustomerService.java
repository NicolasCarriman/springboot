package com.nc.test_api.service;

import java.util.List;
import java.util.Optional;

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

    @Autowired // facilita las injections y agrega el setter
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Custommer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addNewCustomer(Custommer customer) {
        Optional<Custommer> customerByEmail = customerRepository.findCustommerByEmail(customer.getMail());
        if (customerByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        customerRepository.save(customer);
    }

    public void removeCustomer(Long customerId) {
        boolean exists = customerRepository.existsById(customerId);
        if (!exists) {
            throw new IllegalStateException("Customer not found");
        }
        customerRepository.deleteById(customerId); 
    }
}
