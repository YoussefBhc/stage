package com.example.projet.service;

import com.example.projet.entities.Collaborateur;
import com.example.projet.repositories.CollaborateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CollaborateurServiceImpl implements CollaborateurService{

    @Autowired
    CollaborateurRepository collaborateurRepository;


    @Override
    public Collaborateur saveCollaborateur(Collaborateur c) {
        return collaborateurRepository.save(c);
    }

    @Override
    public Collaborateur updateCollaborateur(Collaborateur c) {
        return collaborateurRepository.save(c);
    }

    @Override
    public void deleteCollaborateur(Collaborateur c) {
        collaborateurRepository.delete(c);

    }

    @Override
    public void deleteCollaborateurById(int Id) {
        collaborateurRepository.deleteById(Id);

    }

    @Override
    public Collaborateur getCollaborateur(int Id) {
//get pour qu on retourne un obj de type col non pas optionnal
       return collaborateurRepository.findById(Id).get();
    }

    @Override
    public List<Collaborateur> getAllCollaborateurs() {
        return collaborateurRepository.findAll();
    }


    @Override
    public Page<Collaborateur> getAllCollaborateursParPage(int page, int size) {
        return collaborateurRepository.findAll(PageRequest.of(page, size));
    }
}
