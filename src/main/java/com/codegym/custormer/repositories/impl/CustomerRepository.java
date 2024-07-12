package com.codegym.custormer.repositories.impl;

import com.codegym.custormer.models.Customer;
import com.codegym.custormer.repositories.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"name1","email1","address1"));
        customers.add(new Customer(2,"name2","email2","address2"));
        customers.add(new Customer(3,"name3","email3","address3"));
        customers.add(new Customer(4,"name4","email4","address4"));
        customers.add(new Customer(5,"name5","email5","address5"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
