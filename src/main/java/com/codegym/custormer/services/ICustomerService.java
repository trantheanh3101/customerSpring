package com.codegym.custormer.services;

import com.codegym.custormer.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
