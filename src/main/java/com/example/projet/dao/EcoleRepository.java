package com.example.projet.dao;

import com.example.projet.model.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcoleRepository extends JpaRepository<Ecole, Integer> {
}
