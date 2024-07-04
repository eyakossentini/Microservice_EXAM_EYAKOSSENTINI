package com.example.examordinateur.services;

import com.example.examordinateur.dto.OrdinateurDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "quantite" , url = "http://localhost:8085")
public interface QuantiteClient {

    @GetMapping("/ordinateur/getbyid/{id}")
    OrdinateurDTO getById(@PathVariable("id") String id);

}
