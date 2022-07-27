/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.controller;

import com.mycompany.noticias.conexion.ConexionDB;
import com.mycompany.noticias.model.Personal;
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
public class PersonalDAO {
    
        public boolean insert(Personal pojo) {
        String sql = "INSERT INTO personal( nombre, apepaterno, apematerno, direccion, fechadeingreso) VALUES ('" +
                pojo.getNombre() + "','" +
                pojo.getApepaterno()+ "','" +
                pojo.getDireccion()+ "','" +
                pojo.getFechadeingreso()+ "') ";
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean update(Personal pojo) {
        String sql = "UPDATE personal SET "
                    + "nombre ='"+pojo.getNombre()+"',"
                    + "apepaterno ='"+pojo.getApepaterno()+"',"
                    + "apematerno ='"+pojo.getApematerno()+"',"
                    + "direccion ='"+pojo.getDireccion()+"',"
                    + "fechadeingreso='"+pojo.getFechadeingreso()+"' "
                    + "WHERE idpersonal= "+pojo.getIdpersonal();
        return ConexionDB.getInstance().execute(sql);
    }

    public boolean delete(Integer id) {
        return ConexionDB.getInstance().execute("DELETE FROM personal WHERE idpersonal = "+ id );
    }

    public Personal find(Integer id) {
        Personal personal = null;
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM personal WHERE idregistro = " + id );
            if(rs.next()){
                personal = new Personal(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personal;
    }

    public List<Personal> findAll() {
        List<Personal> personal = new ArrayList<>();
        try{
            ResultSet rs = ConexionDB.getInstance().executeQuery("SELECT * FROM personal");
            while(rs.next()){
                personal.add(new Personal(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personal;
    }
}
