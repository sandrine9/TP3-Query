package com.bnpp.epita.Hibernate.sansSpring.domaine;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String modele;
    private String couleur;

    public Voiture(String modele, String couleur) {
        this.modele = modele;
        this.couleur = couleur;
    }

    public Voiture() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
