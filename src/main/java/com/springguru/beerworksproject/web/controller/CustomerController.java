package com.springguru.beerworksproject.web.controller;

import com.springguru.beerworksproject.services.CustomerService;
import com.springguru.beerworksproject.web.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    private final CustomerService customerService;

    @GetMapping({"/{customer}"})
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable UUID customer) {
        return new ResponseEntity<>(customerService.getCustomer(customer), HttpStatus.OK);
    }
}
