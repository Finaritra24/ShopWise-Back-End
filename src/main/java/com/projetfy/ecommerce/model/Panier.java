package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

import java.sql.Timestamp;

public class Panier extends DBTable {
    private String idPanier;
    private Timestamp datePanier;
    private String idUser;
    private int statut;

    public Panier() {}

    public Panier(String idUser, int statut) {
        this.idUser = idUser;
        this.statut = statut;
    }

    public String getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(String idPanier) {
        this.idPanier = idPanier;
    }

    public Timestamp getDatePanier() {
        return datePanier;
    }

    public void setDatePanier(Timestamp datePanier) {
        this.datePanier = datePanier;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
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
                ", datePanier=" + datePanier +
                ", idUser='" + idUser + '\'' +
                ", statut=" + statut +
                '}';
    }
}
