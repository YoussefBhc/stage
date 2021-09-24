package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ArchivePosteActuel implements Serializable {

    private Date dateDebutPoste;
    private Date dateFinPoste;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idArchivePosteActuel;


    @ManyToOne
    @JoinColumn(name="idCollaborateur")
    private Collaborateur collaborateur;


    @ManyToOne
    @JoinColumn(name = "idPosteActuel")
    private PosteActuel posteActuel;

   /* @JoinTable(name = "ArchivePosteActuel", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_PosteActuel"))
    private Collaborateur collaborateur;
    private PosteActuel posteActuel;*/

    public ArchivePosteActuel() {
    }

    public ArchivePosteActuel(Date dateDebutPoste, Date dateFinPoste, int idArchivePosteActuel, Collaborateur collaborateur, PosteActuel posteActuel) {
        this.dateDebutPoste = dateDebutPoste;
        this.dateFinPoste = dateFinPoste;
        this.idArchivePosteActuel = idArchivePosteActuel;
        this.collaborateur = collaborateur;
        this.posteActuel = posteActuel;
    }

    public Date getDateDebutPoste() {
        return dateDebutPoste;
    }

    public void setDateDebutPoste(Date dateDebutPoste) {
        this.dateDebutPoste = dateDebutPoste;
    }

    public Date getDateFinPoste() {
        return dateFinPoste;
    }

    public void setDateFinPoste(Date dateFinPoste) {
        this.dateFinPoste = dateFinPoste;
    }

    public int getIdArchivePosteActuel() {
        return idArchivePosteActuel;
    }

    public void setIdArchivePosteActuel(int idArchivePosteActuel) {
        this.idArchivePosteActuel = idArchivePosteActuel;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public PosteActuel getPosteActuel() {
        return posteActuel;
    }

    public void setPosteActuel(PosteActuel posteActuel) {
        this.posteActuel = posteActuel;
    }
}
