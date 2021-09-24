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
    private Collaborateur collaborateur;

    public BusinessUnit() {
        super();
    }

    public BusinessUnit(String nomBusinessUnit) {
        super();
        this.nomBusinessUnit = nomBusinessUnit;

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

   }
