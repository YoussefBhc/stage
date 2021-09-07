package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Site implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSite;
    private String nomSite;

    @OneToMany
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;

    public Site() {
        super();
    }

    public Site(String nomSite, Collaborateur collaborateur) {
        super();
        this.nomSite = nomSite;
        this.collaborateur = collaborateur;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
