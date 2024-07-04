package com.example.examquantite.controllers;

import com.example.examquantite.entities.Quantite;
import com.example.examquantite.services.IQuantiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quantite")
public class QuantiteController {

        @Autowired
        private IQuantiteService iQuantiteService;
        @PostMapping("/addQuantite")
        public Quantite ajouterQuantite(@RequestBody Quantite quantite){
            return iQuantiteService.addQuantite(quantite);
        }

        @PostMapping("/updateQuantite")
        public Quantite updateQuantite(@RequestBody Quantite quantite){
            return iQuantiteService.updateQuantite(quantite);
        }

        @GetMapping("/getQuantite")
        public List<Quantite> getAllQuantite(){return iQuantiteService.getAllQuantites();}

        @DeleteMapping("/delete/{id}")
        public void deleteQuantiteById(@PathVariable("id") String id){
            iQuantiteService.deleteQuantiteById(id);

        }

        @GetMapping("/getbyid/{id}")

        public Quantite getQuantiteById(@PathVariable("id") String id) {
            return iQuantiteService.getQuantiteById(id);


        }
    }
