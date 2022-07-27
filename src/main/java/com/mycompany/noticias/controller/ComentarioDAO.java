/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.controller;

import com.mycompany.noticias.conexion.ConexionDB;
import com.mycompany.noticias.model.Comentarios;
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
public class ComentarioDAO {
    
    public boolean insert(Comentarios pojo) {
        String sql = "INSERT INTO comentarios(idregistro, idnoticia, comentario, fecha, hora) VALUES (" +
                pojo.getIdregistro()+ " , " +
                pojo.getIdnoticia()+ " ,'" +
                pojo.getComentario()+ "','" +
                pojo.getFecha()+ "','" +
                pojo.getHora()+ "') ";
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean update(Comentarios pojo) {
        String sql = "UPDATE comentarios SET "
                + "idregistro ='"+pojo.getIdregistro()+"', "
                + "idnoticia='"+pojo.getIdnoticia()+"' ,"
                + "comentario ='"+pojo.getComentario()+"', "
                + "fecha ='"+pojo.getFecha()+"',"
                + "hora ='"+pojo.getHora()+"' "
                + "WHERE idcomentario= "+pojo.getIdcomentario();
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean delete(Integer id) {
        return ConexionDB.getInstance().execute("DELETE FROM comentarios WHERE idcomentario = "+ id );
    }

    public Comentarios find(Integer id) {
        Comentarios comentarios = null;
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM comentarios WHERE idcomentario = " + id );
            if(rs.next()){
                comentarios = new Comentarios(rs.getLong(1), rs.getLong(2), rs.getLong(3), rs.getString(4),rs.getString(5),rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comentarios;
    }

    public List<Comentarios> findAll() {
        List<Comentarios> comentarios = new ArrayList<>();
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM personal");
            while(rs.next()){
                comentarios.add(new Comentarios(rs.getLong(1), rs.getLong(2), rs.getLong(3), rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comentarios;
    }
    
    
}
