package com.example.examordinateur.dto;


import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class QuantiteDTO {
    @Id
    private String  id;
    private String prix;

    public QuantiteDTO() {

    }

}
