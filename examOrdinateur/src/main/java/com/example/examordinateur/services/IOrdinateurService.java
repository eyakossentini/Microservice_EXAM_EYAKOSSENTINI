package com.example.examordinateur.services;

import com.example.examordinateur.dto.OrdinateurDTO;
import com.example.examordinateur.entities.Ordinateur;

import java.util.List;

public interface IOrdinateurService {

    OrdinateurDTO addOrdinateur(OrdinateurDTO ordinateur);
    Ordinateur updateOrdinateur(Ordinateur ordinateur);
    List<OrdinateurDTO> getAllOrdinateurs();
   // OrdinateurDTO getOrdinateurById(long id);
    void deleteOrdinateurById(long id);
    void deleteOrdinateur(Ordinateur ordinateur);
}
