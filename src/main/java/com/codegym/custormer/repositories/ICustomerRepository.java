package com.codegym.custormer.repositories;

import com.codegym.custormer.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
