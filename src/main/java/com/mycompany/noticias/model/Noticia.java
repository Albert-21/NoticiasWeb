/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noticias.model;

/**
 *
 * @author Alberto
 */
public class Noticia {
    private long idnoticia;
    private String noticia;
    private long idpersonal;

    public Noticia(long idnoticia, String noticia, long idpersonal) {
        this.idnoticia = idnoticia;
        this.noticia = noticia;
        this.idpersonal = idpersonal;
    }

    public Noticia(String noticia, long idpersonal) {
        this.noticia = noticia;
        this.idpersonal = idpersonal;
    }
    
    

    public long getIdnoticia() {
        return idnoticia;
    }

    public void setIdnoticia(long idnoticia) {
        this.idnoticia = idnoticia;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public long getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(long idpersonal) {
        this.idpersonal = idpersonal;
    }
    
    
    
}
