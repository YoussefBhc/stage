package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class NiveauTechnologie implements Serializable {

    @Id
    private int niveau;

    @JoinTable(name = "NiveauTechnologie", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_Technologie"))
    private Collaborateur collaborateur;
    private Technologie technologie;
}
