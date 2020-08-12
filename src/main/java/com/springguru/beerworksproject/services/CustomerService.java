package com.springguru.beerworksproject.services;


import com.springguru.beerworksproject.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomer(UUID id);
}
