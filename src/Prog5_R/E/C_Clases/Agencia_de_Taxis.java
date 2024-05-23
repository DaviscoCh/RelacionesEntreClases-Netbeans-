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
public class Agencia_de_Taxis {
    private Choferes choferes;
    private Taxis taxis;
    private Carreras carreras;

    public Agencia_de_Taxis() {
    }

    public Agencia_de_Taxis(Choferes choferes, Taxis taxis, Carreras carreras) {
        this.choferes = choferes;
        this.taxis = taxis;
        this.carreras = carreras;
    }

    public Choferes getChoferes() {
        return choferes;
    }

    public void setChoferes(Choferes choferes) {
        this.choferes = choferes;
    }

    public Taxis getTaxis() {
        return taxis;
    }

    public void setTaxis(Taxis taxis) {
        this.taxis = taxis;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }
}