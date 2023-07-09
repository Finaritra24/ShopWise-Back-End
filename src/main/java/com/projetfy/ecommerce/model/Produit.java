package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Produit extends DBTable {
    private String idProduit;
    private String idCategorie;
    private String nom;
    private double quantite;
    private double prix;
    private String img;

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Produit() {}

    public Produit(String idCategorie, String nom, double quantite, double prix,String img) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.img=img;
    }
    public Produit( String nom, double quantite, double prix,String img) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.img=img;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
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

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNameAuto() {
        return "PDT";
    }

    public String getSeqName() {
        return "sproduit";
    }

    public String toString() {
        return "Produit{" +
                "idProduit='" + idProduit + '\'' +
                ", idCategorie='" + idCategorie + '\'' +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
