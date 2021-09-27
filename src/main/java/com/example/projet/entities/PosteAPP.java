package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class PosteAPP implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPosteAPP;
    private String nomPosteAPP;


    @OneToMany(mappedBy = "posteAPP")
    List<ArchivePosteAPP> archivePosteAPPS;
    /*
    @ManyToMany(targetEntity = Collaborateur.class)
    private List<Collaborateur> collaborateurs;*/

    public PosteAPP() {
    }

    public PosteAPP(int idPosteAPP, String nomPosteAPP) {
        this.idPosteAPP = idPosteAPP;
        this.nomPosteAPP = nomPosteAPP;

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


}
