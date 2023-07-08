package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

import java.sql.Timestamp;

public class AchatPanier extends DBTable {
    private String idAchatPanier;
    private String idPanier;
    private String idUser;
    private Timestamp dateAchat;

    public AchatPanier() {}

    public AchatPanier(String idPanier, String idUser, Timestamp dateAchat) {
        this.idPanier = idPanier;
        this.idUser = idUser;
        this.dateAchat = dateAchat;
    }

    public AchatPanier(String idAchatPanier, String idPanier, String idUser, Timestamp dateAchat) {
        this.idAchatPanier = idAchatPanier;
        this.idPanier = idPanier;
        this.idUser = idUser;
        this.dateAchat = dateAchat;
    }

    public String getIdAchatPanier() {
        return idAchatPanier;
    }

    public void setIdAchatPanier(String idAchatPanier) {
        this.idAchatPanier = idAchatPanier;
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

    public Timestamp getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Timestamp dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getNameAuto() {
        return "ACP";
    }

    @Override
    public String getSeqName() {
        return "sachatpanier";
    }

    @Override
    public String toString() {
        return "AchatPanier{" +
                "idAchatPanier='" + idAchatPanier + '\'' +
                ", idPanier='" + idPanier + '\'' +
                ", idUser='" + idUser + '\'' +
                ", dateAchat=" + dateAchat +
                '}';
    }
}
