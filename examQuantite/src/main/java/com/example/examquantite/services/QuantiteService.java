package com.example.examquantite.services;


import com.example.examquantite.entities.Quantite;
import com.example.examquantite.repositories.QuantiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuantiteService implements IQuantiteService{

        @Autowired
        private QuantiteRepository quantiteRepository;


        @Override
        public Quantite addQuantite(Quantite quantite) {
            quantiteRepository.save(quantite);
            return quantite;    }

        @Override
        public Quantite updateQuantite(Quantite quantite) {
            return quantiteRepository.save(quantite);
        }

        @Override
        public List<Quantite> getAllQuantites() {
            return quantiteRepository.findAll();
        }

        @Override
        public Quantite getQuantiteById(String id) {
            return quantiteRepository.findById(id).get();
        }


        @Override
        public void deleteQuantiteById(String id) {
            quantiteRepository.deleteById(id);


        }

    }