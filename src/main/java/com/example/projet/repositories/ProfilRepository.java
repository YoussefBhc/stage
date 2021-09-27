package com.example.projet.repositories;

import com.example.projet.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil,Integer> {
}
