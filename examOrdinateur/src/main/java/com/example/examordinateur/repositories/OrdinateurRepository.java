package com.example.examordinateur.repositories;

import com.example.examordinateur.entities.Ordinateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdinateurRepository extends JpaRepository<Ordinateur,Long> {
}
