package com.microtransaction.microtransaction.controller;

import com.microtransaction.microtransaction.model.Operation;
import com.microtransaction.microtransaction.model.Rate;
import com.microtransaction.microtransaction.dao.OperationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.client.RestTemplate;
import java.lang.String;
import java.net.URI;
import java.util.*;

@RestController
public class OperationController {

    @Autowired
    private OperationDAO operationDAO;

    @GetMapping(value = "Operations")
    public List<Operation> listOperations(){
        return operationDAO.findAll();
    }
    //Rate/{id}
    @GetMapping(value = "Operations/{id}")
    public Operation printOperation(@PathVariable int id){
        return operationDAO.findById(id);
    }

    @Transactional
    @DeleteMapping(value = "Operations/{id}")
    public void deleteOperation(@PathVariable int id){
        operationDAO.deleteById(id);
    }

    @PostMapping(value = "/Operations")
    public ResponseEntity<Void> addOperation(@RequestBody Operation operation){
        Operation addedOperation = operationDAO.save(operation);
        if(operation == null){
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedOperation.getId()).toUri();
        return ResponseEntity.created(location).build();

    }

    @GetMapping(value = "Operations/from/{from}/to/{to}/date/{date}")
    public String getRate(@PathVariable String from, @PathVariable String to, @PathVariable String date){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        uriVariables.put("date", date);
        String url = "http://localhost:9090/Rates/from/{from}/to/{to}/date/{date}";
        RestTemplate restTemplate = new RestTemplate();
        Rate rt = restTemplate.getForObject(url, Rate.class, uriVariables);
        return "The Rate is : " + rt.getRate();
    }

}
