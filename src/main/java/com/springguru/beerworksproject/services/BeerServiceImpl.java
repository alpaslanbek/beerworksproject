package com.springguru.beerworksproject.services;

import com.springguru.beerworksproject.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().beerName("Tuborg").beerStyle("Pilsner").id(UUID.randomUUID()).upc(1L).build();
    }

    @Override
    public BeerDTO createNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
