package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Technologie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTechnologie;
    private String nomTechnologie;

    @ManyToMany(mappedBy = "idCollaborateur")
    private Collaborateur collaborateur;

    public Technologie() {
    }

    public Technologie(int idTechnologie, String nomTechnologie, Collaborateur collaborateur) {
        this.idTechnologie = idTechnologie;
        this.nomTechnologie = nomTechnologie;
        this.collaborateur = collaborateur;
    }

    public int getIdTechnologie() {
        return idTechnologie;
    }

    public void setIdTechnologie(int idTechnologie) {
        this.idTechnologie = idTechnologie;
    }

    public String getNomTechnologie() {
        return nomTechnologie;
    }

    public void setNomTechnologie(String nomTechnologie) {
        this.nomTechnologie = nomTechnologie;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
