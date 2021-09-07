package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class PosteActuel implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPosteActuel;
    private String nomPosteActuel;

    @ManyToMany(mappedBy = "idCollaborateur")
    private Collaborateur collaborateur;

    public PosteActuel() {
    }

    public PosteActuel(int idPosteActuel, String nomPosteActuel, Collaborateur collaborateur) {
        this.idPosteActuel = idPosteActuel;
        this.nomPosteActuel = nomPosteActuel;
        this.collaborateur = collaborateur;
    }

    public int getIdPosteActuel() {
        return idPosteActuel;
    }

    public void setIdPosteActuel(int idPosteActuel) {
        this.idPosteActuel = idPosteActuel;
    }

    public String getNomPosteActuel() {
        return nomPosteActuel;
    }

    public void setNomPosteActuel(String nomPosteActuel) {
        this.nomPosteActuel = nomPosteActuel;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
