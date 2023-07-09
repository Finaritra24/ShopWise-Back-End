package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Categorie extends DBTable {
    private String idCategorie;
    private String nom;
    private String img;

    public Categorie() {}

    public Categorie(String nom,String img) {
        this.nom = nom;
        this.img=img;
    }
    public Categorie(String id,String nom,String img) {
        this.idCategorie=id;
        this.nom = nom;
        this.img=img;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
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
