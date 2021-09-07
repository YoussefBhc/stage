package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class PosteAPP implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPosteAPP;
    private String nomPosteAPP;

    @ManyToMany(mappedBy = "idCollaborateur")
    private Collaborateur collaborateur;

    public PosteAPP() {
    }

    public PosteAPP(int idPosteAPP, String nomPosteAPP, Collaborateur collaborateur) {
        this.idPosteAPP = idPosteAPP;
        this.nomPosteAPP = nomPosteAPP;
        this.collaborateur = collaborateur;
    }

    public int getIdPosteAPP() {
        return idPosteAPP;
    }

    public void setIdPosteAPP(int idPosteAPP) {
        this.idPosteAPP = idPosteAPP;
    }

    public String getNomPosteAPP() {
        return nomPosteAPP;
    }

    public void setNomPosteAPP(String nomPosteAPP) {
        this.nomPosteAPP = nomPosteAPP;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
