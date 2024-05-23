/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog5_R.E.C_Clases;

/**
 *
 * @author Charlie Cordova 
 */
public class Servicio {
    private Carreras carreras;
    private String Locacion;

    public Servicio() {
    }

    public Servicio(Carreras carreras, String Locacion) {
        this.carreras = carreras;
        this.Locacion = Locacion;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }

    public String getLocacion() {
        return Locacion;
    }

    public void setLocacion(String Locacion) {
        this.Locacion = Locacion;
    }

    
}
