package com.example.projet.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;

public class Profil implements Serializable {

    @Id @GeneratedValue
    private int idProfil;
    private String nomProfil;

    @OneToMany
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;

    public Profil() {
        super();
    }

    //les getters et setters
    public Profil(String nomProfil, Collaborateur collaborateur) {
        this.nomProfil = nomProfil;
        this.collaborateur = collaborateur;
    }

    public int getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(int idProfil) {
        this.idProfil = idProfil;
    }

    public String getNomProfil() {
        return nomProfil;
    }

    public void setNomProfil(String nomProfil) {
        this.nomProfil = nomProfil;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
