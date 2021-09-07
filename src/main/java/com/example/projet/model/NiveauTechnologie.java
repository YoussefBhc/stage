package com.example.projet.model;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;

public class NiveauTechnologie implements Serializable {

    private int niveau;
    @ManyToMany
    @JoinTable(name = "NiveauTechnologie", joinColumns = @JoinColumn(name = "idCollaborateur"), inverseJoinColumns =@JoinColumn(name = "idTechnologie"))
    private Collaborateur collaborateur;
    private Technologie technologie;
}
