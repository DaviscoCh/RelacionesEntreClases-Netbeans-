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
public class Taxis extends Vehiculo {
    private Gasolina gasolina;

    public Taxis() {
    }

    public Taxis(Gasolina gasolina) {
        this.gasolina = gasolina;
    }

    public Gasolina getGasolina() {
        return gasolina;
    }

    public void setGasolina(Gasolina gasolina) {
        this.gasolina = gasolina;
    }

}
