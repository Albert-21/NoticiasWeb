/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.model;

/**
 *
 * @author Alberto
 */
public class Registro {
    
   private long idregistro;
   private String nombre;
   private String contrasena;
   private String Tipo;

    public Registro(long idregistro, String nombre, String contrasena, String Tipo) {
        this.idregistro = idregistro;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.Tipo = Tipo;
    }

    public Registro(String nombre, String contrasena, String Tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.Tipo = Tipo;
    }
   
   

    public long getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(long idregistro) {
        this.idregistro = idregistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
