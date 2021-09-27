package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class ArchiveSalaire implements Serializable {

    private Date dateDebutSalaire;
    private Date dateFinSalaire;
    @Id
    @GeneratedValue
    private int idArchiveSalaire;
    private float montantSalaire;


   @OneToMany(mappedBy = "archiveSalaire")
   private List<Collaborateur> collaborateurs;

    public ArchiveSalaire() {
        super();
    }

    public ArchiveSalaire(Date dateDebutSalaire, Date dateFinSalaire ,float montantSalaire) {
        super();
        this.dateDebutSalaire = dateDebutSalaire;
        this.dateFinSalaire = dateFinSalaire;
        this.montantSalaire = montantSalaire;

    }

    public Date getDateDebutSalaire() {
        return dateDebutSalaire;
    }

    public void setDateDebutSalaire(Date dateDebutSalaire) {
        this.dateDebutSalaire = dateDebutSalaire;
    }

    public Date getDateFinSalaire() {
        return dateFinSalaire;
    }

    public void setDateFinSalaire(Date dateFinSalaire) {
        this.dateFinSalaire = dateFinSalaire;
    }

    public int getIdArchiveSalaire() {
        return idArchiveSalaire;
    }

    public void setIdArchiveSalaire(int idArchiveSalaire) {
        this.idArchiveSalaire = idArchiveSalaire;
    }

    public float getMontantSalaire() {
        return montantSalaire;
    }

    public void setMontantSalaire(float montantSalaire) {
        this.montantSalaire = montantSalaire;
    }


}
