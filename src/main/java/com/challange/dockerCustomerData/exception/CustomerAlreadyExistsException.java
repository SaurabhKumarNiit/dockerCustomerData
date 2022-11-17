package com.challange.dockerCustomerData.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT , reason = "Customer id already exists")
public class CustomerAlreadyExistsException extends Exception{
}
