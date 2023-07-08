package com.projetfy.ecommerce.genericDAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connex {
    public static Connection getConnection() throws Exception
    {
        String url = "jdbc:postgresql://localhost:5432/ecommerce";
        String user = "postgres";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}