package com.example.projet.dao;

import com.example.projet.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil,Integer> {
}
