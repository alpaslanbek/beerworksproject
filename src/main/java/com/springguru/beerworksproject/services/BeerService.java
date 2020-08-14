package com.springguru.beerworksproject.services;

import com.springguru.beerworksproject.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
    BeerDTO createNewBeer(BeerDTO beerDTO);
}
