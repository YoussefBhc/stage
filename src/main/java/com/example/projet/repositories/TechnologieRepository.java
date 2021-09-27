package com.example.projet.repositories;

import com.example.projet.entities.Technologie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologieRepository extends JpaRepository<Technologie,Integer> {
}
