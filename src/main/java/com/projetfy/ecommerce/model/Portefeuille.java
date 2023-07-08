package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Portefeuille extends DBTable {
    private String idPortefeuille;
    private double montant;
    private String identification;
    private String passwrd;

    public Portefeuille() {}

    public Portefeuille(double montant, String identification, String passwrd) {
        this.montant = montant;
        this.identification = identification;
        this.passwrd = passwrd;
    }

    public String getIdPortefeuille() {
        return idPortefeuille;
    }

    public void setIdPortefeuille(String idPortefeuille) {
        this.idPortefeuille = idPortefeuille;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getNameAuto() {
        return "PTF";
    }

    public String getSeqName() {
        return "sportefeuille";
    }

    public String toString() {
        return "Portefeuille{" +
                "idPortefeuille='" + idPortefeuille + '\'' +
                ", montant=" + montant +
                ", identification='" + identification + '\'' +
                ", passwrd='" + passwrd + '\'' +
                '}';
    }
}
