package com.mycompany.noticias.conexion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    private static ConexionDB con = null;

    public static ConexionDB getInstance() {
        if (con == null) {
            con = new ConexionDB();
        }
        return con;
    }

    private Connection conn;

    private ConexionDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/noticiasdb", "root", "");
        } catch (SQLException e) {
            System.out.println("Ocurrio un problema" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La conexion ocurrio sin problemas");
    }

    public boolean execute(String sql) {
        boolean res = false;
        try {
            Statement st = conn.createStatement();
            st.execute(sql);
            res = true;
        } catch (SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
        }
        return res;
    }

    public Connection Connection() {
        return conn;
    }

    public ResultSet executeQuery(String sql) {
        ResultSet res = null;
        try {
            Statement st = conn.createStatement();
            res = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
