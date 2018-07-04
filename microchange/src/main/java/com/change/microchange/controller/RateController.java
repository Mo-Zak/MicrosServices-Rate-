package com.change.microchange.controller;

import java.net.URI;
import java.util.List;
import java.lang.String;
import com.change.microchange.dao.RateDAO;
import com.change.microchange.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.transaction.annotation.Transactional;


@RestController
public class RateController {

    @Autowired
    private RateDAO rateDAO;

    @GetMapping(value = "Rates")
    public List<Rate> listRates(){
        return rateDAO.findAll();
    }
    //Rate/{currencySource,currencyDestination,date}
    @GetMapping(value = "Rates/{id}")
    public Rate printRate(@PathVariable int id){
        return rateDAO.findById(id);
    }
    @Transactional
    @DeleteMapping(value = "Rates/{id}")
    public void deleteRate(@PathVariable int id){
        rateDAO.deleteById(id);
    }

    @PostMapping(value = "/Rates")
    public ResponseEntity<Void> addRate(@RequestBody Rate rate){
        Rate addedRate = rateDAO.save(rate);
        if(rate == null){
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedRate.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "Rates/from/{from}/to/{to}/date/{date}")
    public Rate findRate(@PathVariable String from, @PathVariable String to, @PathVariable String date){
        return rateDAO.findByCurrencySourceAndCurrencyDestinationAndDate(from, to, date);
    }
}
