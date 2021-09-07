package com.example.projet.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ecole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEcole;
    private String nomEcole;

    @ManyToMany(mappedBy = "idCollaborateur")
    private Collaborateur collaborateur;

    public Ecole() {
        super();
    }

    public Ecole(int idEcole, String nomEcole, Collaborateur collaborateur) {
        super();
        this.idEcole = idEcole;
        this.nomEcole = nomEcole;
        this.collaborateur = collaborateur;
    }

    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
