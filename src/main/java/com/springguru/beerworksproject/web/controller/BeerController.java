package com.springguru.beerworksproject.web.controller;

import com.springguru.beerworksproject.services.BeerService;
import com.springguru.beerworksproject.web.model.BeerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    private final BeerService beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDTO> createNewBear(@RequestBody BeerDTO beerDTO) {
        BeerDTO createdBeerDTO = beerService.createNewBeer(beerDTO);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "api/v1/beer/" + createdBeerDTO.getId());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
}
