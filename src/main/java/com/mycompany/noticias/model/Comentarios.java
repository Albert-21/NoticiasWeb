/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Alberto
 */
public class Comentarios {
    private long idcomentario;
    private long idregistro;
    private long idnoticia;
    private String comentario;
    private String fecha;
    private String hora;

    public Comentarios(long idcomentario, long idregistro, long idnoticia, String comentario, String fecha, String hora) {
        this.idcomentario = idcomentario;
        this.idregistro = idregistro;
        this.idnoticia = idnoticia;
        this.comentario = comentario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Comentarios(long idregistro, long idnoticia, String comentario, String fecha, String hora) {
        this.idregistro = idregistro;
        this.idnoticia = idnoticia;
        this.comentario = comentario;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    

    public long getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(long idcomentario) {
        this.idcomentario = idcomentario;
    }

    public long getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(long idregistro) {
        this.idregistro = idregistro;
    }

    public long getIdnoticia() {
        return idnoticia;
    }

    public void setIdnoticia(long idnoticia) {
        this.idnoticia = idnoticia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = new SimpleDateFormat("hh:mm:ss").format(hora);
    }
    
    
    
}
