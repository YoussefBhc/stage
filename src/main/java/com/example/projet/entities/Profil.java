package com.example.projet.entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Profil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfil;
    private String nomProfil;


    @OneToMany(mappedBy = "profil")
    private List<Collaborateur> collaborateurs = new ArrayList<>();

    public Profil() {
        super();
    }

    //les getters et setters
    public Profil(String nomProfil) {
        this.nomProfil = nomProfil;

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




}
