/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.controller;

import com.mycompany.noticias.conexion.ConexionDB;
import com.mycompany.noticias.model.Noticia;
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
public class NoticiaDAO {
    
     
    public boolean insert(Noticia pojo) {
        String sql = "INSERT INTO noticias(noticia, idpersonal) VALUES ('" +
                pojo.getNoticia()+ "','" +
                pojo.getIdpersonal()+ "') ";
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean update(Noticia pojo) {
        String sql = "UPDATE noticias SET "
                +"noticia ='"+pojo.getNoticia()+"',"
                +"idpersonal ='"+pojo.getIdpersonal()+"' "
                +"WHERE idnoticia = "+pojo.getIdnoticia();
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean delete(Integer id) {
        return ConexionDB.getInstance().execute("DELETE FROM noticias WHERE idnoticia = "+ id );
    }

    public Noticia find(Integer id) {
        Noticia noticia = null;
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM noticias WHERE idnoticia = " + id );
            if(rs.next()){
                noticia = new Noticia(rs.getLong(1), rs.getString(2), rs.getLong(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noticia;
    }

    public List<Noticia> findAll() {
        List<Noticia> noticias = new ArrayList<>();
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM noticias");
            while(rs.next()){
                noticias.add(new Noticia(rs.getLong(1), rs.getString(2), rs.getLong(3)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noticias;
    }
    
}
