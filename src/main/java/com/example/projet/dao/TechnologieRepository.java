package com.example.projet.dao;

import com.example.projet.model.Technologie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologieRepository extends JpaRepository<Technologie,Integer> {
}
