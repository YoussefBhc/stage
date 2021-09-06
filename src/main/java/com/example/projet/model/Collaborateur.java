package com.example.projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Collaborateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCollaborateur;
    private int matricule;
    private String nomCollaborateur;
    private String prenomCollaborateur;
    private char sexe;
    private String abreviation;
    private Date dateDepart;
    private Date dateEmbauche;
    private Date dateParticipationSeminaireIntegration;
    private boolean estParti;
    private boolean participationSeminaireIntegration;
    private float salaire;


    //Constructeurs

    public Collaborateur() {
        super();
    }

    public Collaborateur(int matricule, String nomCollaborateur, String prenomCollaborateur, char sexe, String abreviation, Date dateDepart, Date dateEmbauche, Date dateParticipationSeminaireIntegration, boolean estParti, boolean participationSeminaireIntegration, float salaire) {
        super();
        this.matricule = matricule;
        this.nomCollaborateur = nomCollaborateur;
        this.prenomCollaborateur = prenomCollaborateur;
        this.sexe = sexe;
        this.abreviation = abreviation;
        this.dateDepart = dateDepart;
        this.dateEmbauche = dateEmbauche;
        this.dateParticipationSeminaireIntegration = dateParticipationSeminaireIntegration;
        this.estParti = estParti;
        this.participationSeminaireIntegration = participationSeminaireIntegration;
        this.salaire = salaire;
    }

    //les getters

    public int getIdCollaborateur() {
        return idCollaborateur;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNomCollaborateur() {
        return nomCollaborateur;
    }

    public String getPrenomCollaborateur() {
        return prenomCollaborateur;
    }

    public char getSexe() {
        return sexe;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public Date getDateParticipationSeminaireIntegration() {
        return dateParticipationSeminaireIntegration;
    }

    public boolean isEstParti() {
        return estParti;
    }

    public boolean isParticipationSeminaireIntegration() {
        return participationSeminaireIntegration;
    }

    public float getSalaire() {
        return salaire;
    }

    //les setters

    public void setIdCollaborateur(int idCollaborateur) {
        this.idCollaborateur = idCollaborateur;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNomCollaborateur(String nomCollaborateur) {
        this.nomCollaborateur = nomCollaborateur;
    }

    public void setPrenomCollaborateur(String prenomCollaborateur) {
        this.prenomCollaborateur = prenomCollaborateur;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setDateParticipationSeminaireIntegration(Date dateParticipationSeminaireIntegration) {
        this.dateParticipationSeminaireIntegration = dateParticipationSeminaireIntegration;
    }

    public void setEstParti(boolean estParti) {
        this.estParti = estParti;
    }

    public void setParticipationSeminaireIntegration(boolean participationSeminaireIntegration) {
        this.participationSeminaireIntegration = participationSeminaireIntegration;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
}
