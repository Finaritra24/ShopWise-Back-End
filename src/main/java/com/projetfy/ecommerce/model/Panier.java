package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Panier extends DBTable {
    private String idPanier;

    public Panier() {}
    public Panier(String idPanier) {
        this.idPanier=idPanier;
    }

    public String getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(String idPanier) {
        this.idPanier = idPanier;
    }

    public String getNameAuto() {
        return "PNR";
    }

    public String getSeqName() {
        return "spanier";
    }

    public String toString() {
        return "Panier{" +
                "idPanier='" + idPanier + '\'' +
                '}';
    }
}
