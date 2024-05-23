/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregacion;

import java.util.Date;

/**
 *
 * @author Charlie Cordova 
 */
public class Acontecimiento {
    private Date Fecha;
    private String Lugar;
    private String Contexto;
    private Camarografo Camarografo;
    private Periodista Periodista;

    public Acontecimiento() {
    }

    public Acontecimiento(Date Fecha, String Lugar, String Contexto, Camarografo Camarografo, Periodista Periodista) {
        this.Fecha = Fecha;
        this.Lugar = Lugar;
        this.Contexto = Contexto;
        this.Camarografo = Camarografo;
        this.Periodista = Periodista;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getContexto() {
        return Contexto;
    }

    public void setContexto(String Contexto) {
        this.Contexto = Contexto;
    }

    public Camarografo getCamarografo() {
        return Camarografo;
    }

    public void setCamarografo(Camarografo Camarografo) {
        this.Camarografo = Camarografo;
    }

    public Periodista getPeriodista() {
        return Periodista;
    }

    public void setPeriodista(Periodista Periodista) {
        this.Periodista = Periodista;
    }
    
    public String Describirlo(){
        return "El Periodista " + Periodista.getNombre() + "\n" + 
               "se encarga de describir a detalle el hecho que el camarogrado " + "\n"
               + Camarografo.getNombre() + "filmara";
    }
}
