package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class BusinessUnit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBusinessUnit;
    private String nomBusinessUnit;

    @ManyToOne
    @JoinColumn(name = "id_Collaborateur")
    private Collaborateur collaborateur;

    public BusinessUnit() {
        super();
    }

    public BusinessUnit(String nomBusinessUnit, Collaborateur collaborateur) {
        super();
        this.nomBusinessUnit = nomBusinessUnit;
        this.collaborateur = collaborateur;
    }

    public int getIdBusinessUnit() {
        return idBusinessUnit;
    }

    public void setIdBusinessUnit(int idBusinessUnit) {
        this.idBusinessUnit = idBusinessUnit;
    }

    public String getNomBusinessUnit() {
        return nomBusinessUnit;
    }

    public void setNomBusinessUnit(String nomBusinessUnit) {
        this.nomBusinessUnit = nomBusinessUnit;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
