package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class RecetteProduit extends DBTable {
    private String idRecetteProduit;
    private String idRecette;
    private String idProduit;

    public RecetteProduit() {}

    public RecetteProduit(String idRecette, String idProduit) {
        this.idRecette = idRecette;
        this.idProduit = idProduit;
    }

    public String getIdRecetteProduit() {
        return idRecetteProduit;
    }

    public void setIdRecetteProduit(String idRecetteProduit) {
        this.idRecetteProduit = idRecetteProduit;
    }

    public String getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(String idRecette) {
        this.idRecette = idRecette;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getNameAuto() {
        return "RPD";
    }

    public String getSeqName() {
        return "srecetteproduit";
    }

    public String toString() {
        return "RecetteProduit{" +
                "idRecetteProduit='" + idRecetteProduit + '\'' +
                ", idRecette='" + idRecette + '\'' +
                ", idProduit='" + idProduit + '\'' +
                '}';
    }
}
