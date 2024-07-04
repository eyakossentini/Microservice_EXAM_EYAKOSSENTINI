package com.example.examordinateur.controllers;

import com.example.examordinateur.dto.OrdinateurDTO;
import com.example.examordinateur.dto.QuantiteDTO;
import com.example.examordinateur.entities.Ordinateur;
import com.example.examordinateur.services.IOrdinateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordinateur")
public class OrdinateurController {

    @Autowired
    private IOrdinateurService iOrdinateurService;

    @PostMapping("/addOrdinateur")
    public OrdinateurDTO ajouterOrdinateur(@RequestBody OrdinateurDTO ordinateur){
        return iOrdinateurService.addOrdinateur(ordinateur);
    }


    @GetMapping("/getOrdinateur")
    public List<OrdinateurDTO> getAllOrdinateur(){return iOrdinateurService.getAllOrdinateurs();}


   /* @GetMapping("/getbyid/{id}")
    public OrdinateurDTO GetById(@PathVariable("id") Long id) {
        return iOrdinateurService.getOrdinateurById(id);
    }*/

    @PostMapping("/updateOrdinateur")
    public Ordinateur updateOrdinateur(Ordinateur a){
        return iOrdinateurService.updateOrdinateur(a);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrdinateurById(@PathVariable("id") Long id) {
        iOrdinateurService.deleteOrdinateurById(id);
    }


}

