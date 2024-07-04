package com.example.examordinateur.mappers;

import com.example.examordinateur.dto.OrdinateurDTO;
import com.example.examordinateur.dto.QuantiteDTO;
import com.example.examordinateur.entities.Ordinateur;
import org.springframework.stereotype.Service;



@Service
public class OrdinateurMapper {


    public static OrdinateurDTO mapToDto(Ordinateur ordinateur) {

        OrdinateurDTO ordinateurDTO = OrdinateurDTO.builder()
                .id(ordinateur.getId())
                .name(ordinateur.getName())
                .price(ordinateur.getPrice())
                .id_quantite(ordinateur.getId_quantite())
                .build();

        return ordinateurDTO;
    }

    public static OrdinateurDTO mapToDto(Ordinateur ordinateur , QuantiteDTO quantiteDTO) {

        OrdinateurDTO ordinateurDTO = OrdinateurDTO.builder()
                .id(ordinateur.getId())
                .name(ordinateur.getName())
                .price(ordinateur.getPrice())
                .id_quantite(ordinateur.getId_quantite())
                .quantiteDTO(quantiteDTO)
                .build();

        return ordinateurDTO;
    }

    public static Ordinateur mapToEntity(OrdinateurDTO ordinateurDTO) {


        Ordinateur ordinateur = Ordinateur.builder()
                .id(ordinateurDTO.getId())
                .name(ordinateurDTO.getName())
                .price(ordinateurDTO.getPrice())
                .id_quantite(ordinateurDTO.getId_quantite())
                .build();

        return ordinateur;

    }

}
