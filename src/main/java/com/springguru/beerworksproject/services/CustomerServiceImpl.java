package com.springguru.beerworksproject.services;

import com.springguru.beerworksproject.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomer(UUID id) {
        return CustomerDTO.builder().name("Alpaslan").id(UUID.randomUUID()).build();
    }
}
