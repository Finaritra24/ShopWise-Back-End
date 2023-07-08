package com.projetfy.ecommerce;


import org.springframework.web.bind.annotation.RestController;

import com.projetfy.ecommerce.model.Categorie;
import com.projetfy.ecommerce.model.Produit;
import com.projetfy.ecommerce.service.ServCategorie;
import com.projetfy.ecommerce.service.ServProduit;

import java.util.Map;
import java.util.Vector;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin
public class ControllerECommerce {


    //administrateur

    @GetMapping("/getAdminId")
    public String getAdminId(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("adminId")) {
                    return cookie.getValue();
                }
            }
        }
        return "null"; // Cookie non trouvé
    }

    //fin admin
        //produit
        @PostMapping("/listProduitById")
        public static Vector<Produit> listProduitById(@RequestBody Map<String, String> vdata, HttpServletResponse response) {
            String id = vdata.get("idcateg");
            ServProduit sp=new ServProduit();
            try {
                Vector<Produit> list=sp.listProduitById(id);
                response.setStatus(HttpServletResponse.SC_OK);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        @PostMapping("/listProduitByIdNom")
        public static Vector<Produit> listProduitByIdNom(@RequestBody Map<String, String> vdata, HttpServletResponse response) {
            String id = vdata.get("idcateg");
            String nom = vdata.get("nom");
            ServProduit sp=new ServProduit();
            try {
                Vector<Produit> list=sp.listProduitByIdNom(id,nom);
                response.setStatus(HttpServletResponse.SC_OK);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        @PostMapping("/listProduitByNom")
        public static Vector<Produit> listProduitByNom(@RequestBody Map<String, String> vdata, HttpServletResponse response) {
            String nom = vdata.get("nom");
            ServProduit sp=new ServProduit();
            try {
                Vector<Produit> list=sp.listProduitByNom(nom);
                response.setStatus(HttpServletResponse.SC_OK);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        @PostMapping("/listProduit")
        public static Vector<Produit> listProduit(@RequestBody Map<String, String> vdata, HttpServletResponse response) {
            ServProduit sp=new ServProduit();
            try {
                Vector<Produit> list=sp.listProduit();
                response.setStatus(HttpServletResponse.SC_OK);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        
        //fin produit
        //categorie
        @GetMapping("/listCategorie")
        public static Vector<Categorie> listCategorie() throws Exception {
            ServCategorie sp=new ServCategorie();
            Vector<Categorie> list=sp.listCategorie();
            return list;
        }
        @GetMapping("/categoriebyId")
        public static Categorie categoriebyId(@RequestBody Map<String, String> vdata, HttpServletResponse response) throws Exception {
            String idc=vdata.get("idc");
            ServCategorie sp=new ServCategorie();
            Categorie list=sp.categoriebyId(idc);
            return list;
        }
        

        //fin categorie

}
