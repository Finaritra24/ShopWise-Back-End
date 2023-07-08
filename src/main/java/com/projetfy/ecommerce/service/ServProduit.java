package com.projetfy.ecommerce.service;

import java.util.Vector;

import com.projetfy.ecommerce.model.Produit;

public class ServProduit {
    public static Vector<Produit> listProduit() throws Exception{
        Vector<Produit> list=new Produit().find("SELECT * FROM produit", null);
        return list;
    }
    public static Vector<Produit> listProduitByIdNom(String idcategorie,String nom) throws Exception{
        Vector<Produit> list=new Produit().find("SELECT * FROM produit where idcategorie='"+idcategorie+"' and upper(nom) like upper('%"+nom+"%')", null);
        return list;
    }
    public static Vector<Produit> listProduitById(String idcategorie) throws Exception{
        Vector<Produit> list=new Produit().find("SELECT * FROM produit where idcategorie='"+idcategorie+"'", null);
        return list;
    }
    public static Vector<Produit> listProduitByNom(String nom) throws Exception{
        Vector<Produit> list=new Produit().find("SELECT * FROM produit where upper(nom) like upper('%"+nom+"%')", null);
        return list;
    }

    public static void main(String[]args) throws Exception{
        Vector<Produit> list=listProduitByNom("r");
        for(Produit p:list){
            System.out.println(p);
        }
    }
}
