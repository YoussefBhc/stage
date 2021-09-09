package com.example.projet.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class CollabRole implements Serializable {

@Id
    private int idCollab;
    private int idRole;

    @JoinTable(name = "CollabRole", joinColumns = @JoinColumn(name = "id_Collaborateur"), inverseJoinColumns =@JoinColumn(name = "id_Role"))
    private Collaborateur collaborateur;
    private Role role;

    public CollabRole() {
    }

    public CollabRole(int idCollab, int idRole) {
        this.idCollab = idCollab;
        this.idRole = idRole;

    }
}
