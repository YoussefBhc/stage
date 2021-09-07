package com.example.projet.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Date;
@Entity
public class ArchiveSalaire implements Serializable {

    private Date dateDebutSalaire;
    private Date dateFinSalaire;
    private int idArchiveSalaire;
   private float montantSalaire;

   @OneToMany
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;

    public ArchiveSalaire() {
        super();
    }

    public ArchiveSalaire(Date dateDebutSalaire, Date dateFinSalaire, int idArchiveSalaire, float montantSalaire, Collaborateur collaborateur) {
        super();
        this.dateDebutSalaire = dateDebutSalaire;
        this.dateFinSalaire = dateFinSalaire;
        this.idArchiveSalaire = idArchiveSalaire;
        this.montantSalaire = montantSalaire;
        this.collaborateur = collaborateur;
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

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
