package com.example.projet.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String role;

    @OneToMany
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;

    public Role() {
    }

    public Role(int idRole, String role, Collaborateur collaborateur) {
        this.idRole = idRole;
        this.role = role;
        this.collaborateur = collaborateur;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
