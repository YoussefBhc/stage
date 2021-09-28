package com.example.projet.service;

import com.example.projet.entities.Collaborateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface CollaborateurService {
    Collaborateur saveCollaborateur(Collaborateur c);
    Collaborateur updateCollaborateur(Collaborateur c);
    void deleteCollaborateur(Collaborateur c);
    void deleteCollaborateurById(int Id);
    Collaborateur getCollaborateur(int Id);
    List<Collaborateur> getAllCollaborateurs();
    Page<Collaborateur> getAllCollaborateursParPage(int page, int size);



}

