package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Categorie extends DBTable {
    private String idCategorie;
    private String nom;

    public Categorie() {}

    public Categorie(String nom) {
        this.nom = nom;
    }
    public Categorie(String idCategorie,String nom) {
        this.idCategorie=idCategorie;
        this.nom = nom;
    }

    public String getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(String idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNameAuto() {
        return "CTG";
    }

    public String getSeqName() {
        return "scategorie";
    }

    public String toString() {
        return "Categorie{" +
                "idCategorie='" + idCategorie + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
