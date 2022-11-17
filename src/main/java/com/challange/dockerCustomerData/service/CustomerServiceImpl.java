package com.challange.dockerCustomerData.service;

import com.challange.dockerCustomerData.domain.Customer;
import com.challange.dockerCustomerData.exception.CustomerAlreadyExistsException;
import com.challange.dockerCustomerData.exception.CustomerNotFoundException;
import com.challange.dockerCustomerData.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException {
        if(customerRepository.findById(customer.getCustomerId()).isPresent()){
            throw new CustomerAlreadyExistsException();
        }
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByCustomerNameAndCustomerPassword(String customerName, String customerPassword) throws CustomerNotFoundException {
        Customer customer = customerRepository.findByCustomerNameAndCustomerPassword(customerName,customerPassword);
        if(customer == null){
            throw new CustomerNotFoundException();
        }
        return customer;
    }

    @Override
    public boolean deleteCustomer(int customerId) throws CustomerNotFoundException {
        boolean flag = false;
        if(customerRepository.findById(customerId).isEmpty()){
            throw new CustomerNotFoundException();
        }
        else{
            customerRepository.deleteById(customerId);
            flag=true;
        }
        return flag;
    }
}
