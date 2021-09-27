package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Technologie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTechnologie;
    private String nomTechnologie;

    @OneToMany(mappedBy = "technologie")
    List<NiveauTechnologie> niveauTechnologies;

    public Technologie() {
    }

    public Technologie(int idTechnologie, String nomTechnologie, Collaborateur collaborateur) {
        this.idTechnologie = idTechnologie;
        this.nomTechnologie = nomTechnologie;

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



}
