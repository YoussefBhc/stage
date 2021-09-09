package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Diplome implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;
    private int typeDiplome;

    @JoinTable(name = "Diplome", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_Ecole"))
    private Collaborateur collaborateur;
    private Ecole ecole;

    public Diplome() {
    }

    public Diplome(int idDiplome, int typeDiplome, Collaborateur collaborateur, Ecole ecole) {
        this.idDiplome = idDiplome;
        this.typeDiplome = typeDiplome;
        this.collaborateur = collaborateur;
        this.ecole = ecole;
    }

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
    }

    public int getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(int typeDiplome) {
        this.typeDiplome = typeDiplome;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }
}


