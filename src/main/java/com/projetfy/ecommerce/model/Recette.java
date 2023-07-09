package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Recette extends DBTable {
    private String idRecette;
    private String nom;

    public Recette() {}

    public Recette(String nom) {
        this.nom = nom;
    }

    public String getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(String idRecette) {
        this.idRecette = idRecette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNameAuto() {
        return "RCT";
    }

    public String getSeqName() {
        return "srecette";
    }

    public String toString() {
        return "Recette{" +
                "idRecette='" + idRecette + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
