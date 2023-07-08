package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

import java.sql.Timestamp;

public class AnnulePanier extends DBTable {
    private String idAnnulePanier;
    private String idPanier;
    private String idUser;
    private Timestamp dateAnnulation;

    public AnnulePanier() {}

    public AnnulePanier(String idPanier, String idUser, Timestamp dateAnnulation) {
        this.idPanier = idPanier;
        this.idUser = idUser;
        this.dateAnnulation = dateAnnulation;
    }

    public AnnulePanier(String idAnnulePanier, String idPanier, String idUser, Timestamp dateAnnulation) {
        this.idAnnulePanier = idAnnulePanier;
        this.idPanier = idPanier;
        this.idUser = idUser;
        this.dateAnnulation = dateAnnulation;
    }

    public String getIdAnnulePanier() {
        return idAnnulePanier;
    }

    public void setIdAnnulePanier(String idAnnulePanier) {
        this.idAnnulePanier = idAnnulePanier;
    }

    public String getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(String idPanier) {
        this.idPanier = idPanier;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Timestamp getDateAnnulation() {
        return dateAnnulation;
    }

    public void setDateAnnulation(Timestamp dateAnnulation) {
        this.dateAnnulation = dateAnnulation;
    }

    public String getNameAuto() {
        return "ACP";
    }

    public String getSeqName() {
        return "sannulepanier";
    }

    @Override
    public String toString() {
        return "AnnulePanier{" +
                "idAnnulePanier='" + idAnnulePanier + '\'' +
                ", idPanier='" + idPanier + '\'' +
                ", idUser='" + idUser + '\'' +
                ", dateAnnulation=" + dateAnnulation +
                '}';
    }
}
