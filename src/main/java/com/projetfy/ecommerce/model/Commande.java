package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Commande extends DBTable {
    private String idCommande;
    private String idProduit;
    private String idPanier;

    public Commande(String idCommande,String idProduit,String idPanier) {
        this.idCommande=idCommande;
        this.idProduit=idProduit;
        this.idPanier=idPanier;
    }
    public Commande(String idProduit,String idPanier) {
        this.idProduit=idProduit;
        this.idPanier=idPanier;
    }
    public Commande(){}

    public String getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(String idCommande) {
        this.idCommande = idCommande;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(String idPanier) {
        this.idPanier = idPanier;
    }

    public String getNameAuto() {
        return "CMD";
    }

    public String getSeqName() {
        return "scommande";
    }

    public String toString() {
        return "Commande{" +
                "idCommande='" + idCommande + '\'' +
                ", idProduit='" + idProduit + '\'' +
                ", idPanier='" + idPanier + '\'' +
                '}';
    }
}
