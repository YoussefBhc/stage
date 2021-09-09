package com.example.projet.model;

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

    @JoinTable(name = "ArchivePosteAPP", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_PosteAPP"))
    private Collaborateur collaborateur;
    private PosteAPP posteAPP;
}
