package com.challange.dockerCustomerData.repository;

import com.challange.dockerCustomerData.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findByCustomerNameAndCustomerPassword(String customerName,String customerPassword);
}
