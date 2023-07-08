package com.projetfy.ecommerce.service;

import java.util.Vector;

import com.projetfy.ecommerce.model.Categorie;

public class ServCategorie {
    public static Categorie  categoriebyId(String idcat) throws Exception{
        Vector<Categorie> list=new Categorie().find("SELECT * FROM categorie where idcategorie='"+idcat+"'", null);
        return list.get(0);
    }
    public static Vector<Categorie> listCategorie() throws Exception{
        Vector<Categorie> list=new Categorie().find("SELECT * FROM categorie", null);
        return list;
    }
    public static void main(String[] args) throws Exception{
        Vector<Categorie> list=listCategorie();
        for(Categorie c:list){
            System.out.println(c);
        }
    }
}
