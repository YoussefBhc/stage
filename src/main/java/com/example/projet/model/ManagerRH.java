package com.example.projet.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;

public class ManagerRH extends Collaborateur{

    private boolean estActivé;
    private String login;
    private String password;

    @OneToMany
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;

    public ManagerRH() {
        super();
    }

    public ManagerRH(int matricule, String nomCollaborateur, String prenomCollaborateur, char sexe, String abreviation, Date dateDepart, Date dateEmbauche, Date dateParticipationSeminaireIntegration, boolean estParti, boolean participationSeminaireIntegration, float salaire, boolean estActivé, String login, String password, Collaborateur collaborateur) {
        super(matricule, nomCollaborateur, prenomCollaborateur, sexe, abreviation, dateDepart, dateEmbauche, dateParticipationSeminaireIntegration, estParti, participationSeminaireIntegration, salaire);
        this.estActivé = estActivé;
        this.login = login;
        this.password = password;
        this.collaborateur = collaborateur;
    }
}
