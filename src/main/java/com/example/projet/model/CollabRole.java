package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class CollabRole implements Serializable {


    private int idCollab;
    private int idRole;
    @ManyToMany
    @JoinTable(name = "CollabRole", joinColumns = @JoinColumn(name = "idCollaborateur"), inverseJoinColumns =@JoinColumn(name = "idRole"))
    private Collaborateur collaborateur;
    private Role role;

    public CollabRole() {
    }

    public CollabRole(int idCollab, int idRole, Collaborateur collaborateur, Role role) {
        this.idCollab = idCollab;
        this.idRole = idRole;
        this.collaborateur = collaborateur;
        this.role = role;
    }
}
