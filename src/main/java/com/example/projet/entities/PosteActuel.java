package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class PosteActuel implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPosteActuel;
    private String nomPosteActuel;

    /*@ManyToMany(targetEntity = Collaborateur.class)
    private List<Collaborateur> collaborateurs;*/

    @OneToMany(mappedBy = "posteActuel")
    List<ArchivePosteActuel> archivePosteActuels;

    public PosteActuel() {
    }

    public PosteActuel(int idPosteActuel, String nomPosteActuel) {
        this.idPosteActuel = idPosteActuel;
        this.nomPosteActuel = nomPosteActuel;

    }

    public int getIdPosteActuel() {
        return idPosteActuel;
    }

    public void setIdPosteActuel(int idPosteActuel) {
        this.idPosteActuel = idPosteActuel;
    }

    public String getNomPosteActuel() {
        return nomPosteActuel;
    }

    public void setNomPosteActuel(String nomPosteActuel) {
        this.nomPosteActuel = nomPosteActuel;
    }


}
