package com.example.examordinateur.dto;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class OrdinateurDTO {

    @Id
    private Long id;
    private String name;

    private String id_quantite;

    private double price;

    private QuantiteDTO quantiteDTO;


}
