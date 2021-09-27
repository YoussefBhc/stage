package com.example.projet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class ManagerRH extends Collaborateur{

    @Column
    private boolean estActivé;
    @Column
    private String login;
    @Column
    private String password;

    @OneToMany(mappedBy = "managerRH")
    private List<Collaborateur> collaborateurs;


    public ManagerRH() {
        super();
    }


//un manager est lui meme un collab mais qui ne possede pas d attribut manager


    public ManagerRH( int matricule, String nomCollaborateur, String prenomCollaborateur, char sexe, String abreviation, Date dateDepart, Date dateEmbauche, Date dateParticipationSeminaireIntegration, boolean estParti, boolean participationSeminaireIntegration, float salaire, boolean estActivé, String login, String password) {
        super(matricule, nomCollaborateur, prenomCollaborateur, sexe, abreviation, dateDepart, dateEmbauche, dateParticipationSeminaireIntegration, estParti, participationSeminaireIntegration, salaire);
        this.estActivé = estActivé;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ManagerRH{" +
                "estActivé=" + estActivé +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
