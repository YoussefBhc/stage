package com.example.projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Collaborateur implements Serializable {

    @Id @GeneratedValue
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




}
