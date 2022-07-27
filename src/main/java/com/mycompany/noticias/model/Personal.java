/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.model;

/**
 *
 * @author Alberto
 */
public class Personal {
    private long idpersonal;
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private String direccion;
    private String fechadeingreso;

    public Personal(long idpersonal, String nombre, String apepaterno, String apematerno, String direccion, String fechadeingreso) {
        this.idpersonal = idpersonal;
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.direccion = direccion;
        this.fechadeingreso = fechadeingreso;
    }

    public Personal(String nombre, String apepaterno, String apematerno, String direccion, String fechadeingreso) {
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.direccion = direccion;
        this.fechadeingreso = fechadeingreso;
    }
    
    
    

    public long getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(long idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }
    
    
    
    
}
