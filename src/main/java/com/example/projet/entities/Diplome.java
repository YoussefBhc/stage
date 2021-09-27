package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Diplome implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diplome_id")
    private int idDiplome;
    @Column(name = "diplome_type")
    private int typeDiplome;


    @ManyToOne
    @JoinColumn(name="idCollaborateur")
    private Collaborateur collaborateur;


    @ManyToOne
    @JoinColumn(name = "idEcole")
    private Ecole ecole;


    /*@JoinTable(name = "Diplome", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_Ecole"))
    private Collaborateur collaborateur;
    private Ecole ecole;*/

    public Diplome() {
    }

    public Diplome(int idDiplome, int typeDiplome) {
        this.idDiplome = idDiplome;
        this.typeDiplome = typeDiplome;

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



    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }
}


