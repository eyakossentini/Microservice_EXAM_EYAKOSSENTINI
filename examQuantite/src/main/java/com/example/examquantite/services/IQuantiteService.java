package com.example.examquantite.services;

import com.example.examquantite.entities.Quantite;

import java.util.List;

public interface IQuantiteService {

        Quantite addQuantite(Quantite quantite);
        Quantite updateQuantite(Quantite quantite);
        List<Quantite> getAllQuantites();
        Quantite getQuantiteById(String id);
        void deleteQuantiteById(String id);
    }