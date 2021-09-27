package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Collaborateur")
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



   @ManyToOne
    private Profil profil;

    @ManyToOne
    private Site site ;

    @ManyToOne
    private  ArchiveSalaire archiveSalaire;

    @ManyToOne
    private ManagerRH managerRH ;

    @OneToMany(mappedBy = "collaborateur")
    private List<BusinessUnit> businessUnits= new ArrayList<>();

    @OneToMany(mappedBy = "collaborateur")
    private List<Role> roles= new ArrayList<>();




@OneToMany(mappedBy = "collaborateur" )
List<Diplome> diplomes;
@OneToMany(mappedBy = "collaborateur")
List<NiveauTechnologie> niveauTechnologies;
@OneToMany(mappedBy = "collaborateur")
List<ArchivePosteActuel> archivePosteActuels;
    @OneToMany(mappedBy = "collaborateur")
    List<ArchivePosteAPP> archivePosteAPPS;

   /* @ManyToMany(targetEntity = Ecole.class)
    private List <Ecole> ecoles= new ArrayList<>();

    @ManyToMany(targetEntity = Technologie.class)
    private List<Technologie> technologies= new ArrayList<>();


    @ManyToMany(targetEntity = PosteActuel.class)
    private List<PosteActuel> posteActuels = new ArrayList<>();


    @ManyToMany(targetEntity = PosteAPP.class)
    private List<PosteAPP> posteAPPS = new ArrayList<>();*/

    //Constructeurs

    public Collaborateur() {
        super();
    }



    public Collaborateur(int matricule, String nomCollaborateur, String prenomCollaborateur, char sexe, String abreviation, Date dateDepart, Date dateEmbauche, Date dateParticipationSeminaireIntegration, boolean estParti, boolean participationSeminaireIntegration, float salaire) {

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
//cstr du collaborateur sans manager pour pouvoir creer un manager


    public Collaborateur(int matricule, String nomCollaborateur, String prenomCollaborateur, char sexe, String abreviation, Date dateDepart, Date dateEmbauche, Date dateParticipationSeminaireIntegration, boolean estParti, boolean participationSeminaireIntegration, float salaire, Profil profil, Site site, ArchiveSalaire archiveSalaire) {

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

    public int getIdCollaborateur() {
        return idCollaborateur;
    }

    public void setIdCollaborateur(int idCollaborateur) {
        this.idCollaborateur = idCollaborateur;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNomCollaborateur() {
        return nomCollaborateur;
    }

    public void setNomCollaborateur(String nomCollaborateur) {
        this.nomCollaborateur = nomCollaborateur;
    }

    public String getPrenomCollaborateur() {
        return prenomCollaborateur;
    }

    public void setPrenomCollaborateur(String prenomCollaborateur) {
        this.prenomCollaborateur = prenomCollaborateur;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateParticipationSeminaireIntegration() {
        return dateParticipationSeminaireIntegration;
    }

    public void setDateParticipationSeminaireIntegration(Date dateParticipationSeminaireIntegration) {
        this.dateParticipationSeminaireIntegration = dateParticipationSeminaireIntegration;
    }

    public boolean isEstParti() {
        return estParti;
    }

    public void setEstParti(boolean estParti) {
        this.estParti = estParti;
    }

    public boolean isParticipationSeminaireIntegration() {
        return participationSeminaireIntegration;
    }

    public void setParticipationSeminaireIntegration(boolean participationSeminaireIntegration) {
        this.participationSeminaireIntegration = participationSeminaireIntegration;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }



    @Override
    public String toString() {
        return "Collaborateur{" +
                "idCollaborateur=" + idCollaborateur +
                ", matricule=" + matricule +
                ", nomCollaborateur='" + nomCollaborateur + '\'' +
                ", prenomCollaborateur='" + prenomCollaborateur + '\'' +
                ", sexe=" + sexe +
                ", abreviation='" + abreviation + '\'' +
                ", dateDepart=" + dateDepart +
                ", dateEmbauche=" + dateEmbauche +
                ", dateParticipationSeminaireIntegration=" + dateParticipationSeminaireIntegration +
                ", estParti=" + estParti +
                ", participationSeminaireIntegration=" + participationSeminaireIntegration +
                ", salaire=" + salaire +

                '}';
    }
}
