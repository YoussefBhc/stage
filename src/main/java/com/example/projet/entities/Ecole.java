package com.example.projet.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Ecole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEcole;
    private String nomEcole;

   /*@ManyToMany(targetEntity = Collaborateur.class)
    private List<Collaborateur> collaborateurs= new ArrayList<>();*/


    @OneToMany(mappedBy = "ecole")
    List<Diplome> diplomes;



    public Ecole() {
        super();
    }

    public Ecole(int idEcole, String nomEcole) {
        super();
        this.idEcole = idEcole;
        this.nomEcole = nomEcole;

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


}
