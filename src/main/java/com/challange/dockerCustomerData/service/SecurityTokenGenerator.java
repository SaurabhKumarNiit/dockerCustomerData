package com.challange.dockerCustomerData.service;

import com.challange.dockerCustomerData.domain.Customer;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String,String> generateToken(Customer customer);
}
