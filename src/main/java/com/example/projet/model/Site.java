package com.example.projet.model;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Site implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSite;
    private String nomSite;

    @OneToMany(mappedBy = "site")
    private List<Collaborateur> collaborateurs;

    public Site() {
        super();
    }

    public Site(String nomSite) {
        super();
        this.nomSite = nomSite;

    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }


}
