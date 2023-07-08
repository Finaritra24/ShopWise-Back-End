package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Produit extends DBTable {
    private String idProduit;
    private String idCategorie;
    private String nom;
    private String uniteMesure;
    private double qte;
    private double prixUnitaire;

    public Produit() {}

    public Produit(String idCategorie, String nom, String uniteMesure, double qte, double prixUnitaire) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.uniteMesure = uniteMesure;
        this.qte = qte;
        this.prixUnitaire = prixUnitaire;
    }
    public Produit(String idProduit,String idCategorie, String nom, String uniteMesure, double qte, double prixUnitaire) {
        this.idProduit=idProduit;
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.uniteMesure = uniteMesure;
        this.qte = qte;
        this.prixUnitaire = prixUnitaire;
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

    public String getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(String uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public double getQte() {
        return qte;
    }

    public void setQte(double qte) {
        this.qte = qte;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
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
                ", uniteMesure='" + uniteMesure + '\'' +
                ", qte=" + qte +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}
