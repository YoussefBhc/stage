package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class NiveauTechnologie implements Serializable {

    @Id
    private int niveau;


    @ManyToOne
    @JoinColumn(name="idCollaborateur")
    private Collaborateur collaborateur;


    @ManyToOne
    @JoinColumn(name = "idTechnologie")
    private Technologie technologie;

   /* @JoinTable(name = "NiveauTechnologie", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_Technologie"))
    private Collaborateur collaborateur;
    private Technologie technologie;*/
}
