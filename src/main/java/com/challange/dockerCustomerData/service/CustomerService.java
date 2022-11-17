package com.challange.dockerCustomerData.service;

import com.challange.dockerCustomerData.domain.Customer;
import com.challange.dockerCustomerData.exception.CustomerAlreadyExistsException;
import com.challange.dockerCustomerData.exception.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException;
    List<Customer> getAllCustomers();
    Customer findByCustomerNameAndCustomerPassword(String customerName,String customerPassword) throws CustomerNotFoundException;
    boolean deleteCustomer(int customerId) throws CustomerNotFoundException;
}
