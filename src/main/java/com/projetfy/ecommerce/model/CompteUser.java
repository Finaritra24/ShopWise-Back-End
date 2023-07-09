package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

import java.sql.Timestamp;

public class CompteUser extends DBTable {
    private String idCompteUser;
    private String idUser;
    private Timestamp dateCompte;
    private double montant;
    private int statut;

    public CompteUser() {}

    public CompteUser(String idUser, double montant) {
        this.idUser = idUser;
        this.montant = montant;
    }

    public String getIdCompteUser() {
        return idCompteUser;
    }

    public void setIdCompteUser(String idCompteUser) {
        this.idCompteUser = idCompteUser;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Timestamp getDateCompte() {
        return dateCompte;
    }

    public void setDateCompte(Timestamp dateCompte) {
        this.dateCompte = dateCompte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getNameAuto() {
        return "CTU";
    }

    public String getSeqName() {
        return "scompteUser";
    }

    public String toString() {
        return "CompteUser{" +
                "idCompteUser='" + idCompteUser + '\'' +
                ", idUser='" + idUser + '\'' +
                ", dateCompte=" + dateCompte +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
