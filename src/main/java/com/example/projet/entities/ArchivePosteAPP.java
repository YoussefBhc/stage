package com.example.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class ArchivePosteAPP implements Serializable {

    private Date dateDebutPosteAPP;
    private Date dateFinPosteAPP;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idArchivePosteAPP;


    @ManyToOne
    @JoinColumn(name="idCollaborateur")
    private Collaborateur collaborateur;


    @ManyToOne
    @JoinColumn(name = "idPosteAPP")
    private PosteAPP posteAPP;
    /*@JoinTable(name = "ArchivePosteAPP", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_PosteAPP"))
    private Collaborateur collaborateur;
    private PosteAPP posteAPP;*/
}
