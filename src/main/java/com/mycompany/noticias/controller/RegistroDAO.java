/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.controller;

import com.mycompany.noticias.conexion.ConexionDB;
import com.mycompany.noticias.model.Registro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto
 */
public class RegistroDAO {
     public RegistroDAO() {
    }

    
    public boolean insert(Registro pojo) {
        String sql = "INSERT INTO registro(nombre, contrasena, tipo) VALUES('" +
                pojo.getNombre() + "','" +
                pojo.getContrasena()+ "','" +
                pojo.getTipo()+ "') ";
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean update(Registro pojo) {
        String sql = "UPDATE registro SET nombre = '"+pojo.getNombre()+
                     "',contrasena= '"+pojo.getContrasena()+
                     "',tipo= '"+pojo.getTipo()+
                     "' WHERE idregistro = "+pojo.getIdregistro();
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean delete(Integer id) {
        return ConexionDB.getInstance().execute("DELETE FROM registro WHERE idregistro = "+ id );
    }

    public Registro find(String nombre, String contraseña) {
        Registro registro = null;
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM registro WHERE nombre = '" + nombre +"' AND contrasena = '"+contraseña+"'");
            if(rs.next()){
                registro = new Registro(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registro;
    }

    public List<Registro> findAll() {
        List<Registro> registro = new ArrayList<>();
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM registro");
            while(rs.next()){
                registro.add(new Registro(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registro;
    }
    
}
