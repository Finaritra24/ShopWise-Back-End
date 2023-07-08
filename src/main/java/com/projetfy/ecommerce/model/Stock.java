package com.projetfy.ecommerce.model;

import com.projetfy.ecommerce.genericDAO.DBTable;

public class Stock extends DBTable {
    private String idStock;
    private String idProduit;
    private int nombre;

    public Stock() {}

    public Stock(String idProduit, int nombre) {
        this.idProduit = idProduit;
        this.nombre = nombre;
    }

    public Stock(String idst,String idProduit, int nombre) {
        this.idStock=idst;
        this.idProduit = idProduit;
        this.nombre = nombre;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getNameAuto() {
        return "STK";
    }

    public String getSeqName() {
        return "sstock";
    }

    public String toString() {
        return "Stock{" +
                "idStock='" + idStock + '\'' +
                ", idProduit='" + idProduit + '\'' +
                ", nombre=" + nombre +
                '}';
    }
}
