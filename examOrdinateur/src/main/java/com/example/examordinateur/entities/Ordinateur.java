package com.example.examordinateur.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "ordinateur")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ordinateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    private String id_quantite;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // getters and setters
}
