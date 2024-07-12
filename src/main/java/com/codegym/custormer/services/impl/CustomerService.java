package com.codegym.custormer.services.impl;

import com.codegym.custormer.models.Customer;
import com.codegym.custormer.repositories.ICustomerRepository;
import com.codegym.custormer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
