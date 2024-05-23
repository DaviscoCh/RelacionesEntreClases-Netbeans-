/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog5_R.E.C_Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Chralie Cordova
 */
public class Gasolina {

    private String Tipo;
    private int cantidadGasolina;
    private double costo;

    public Gasolina() {
    }

    public Gasolina(String Tipo, int cantidadGasolina, double costo) {
        this.Tipo = Tipo;
        this.cantidadGasolina = cantidadGasolina;
        this.costo = costo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCantidadGasolina() {
        return cantidadGasolina;
    }

    public void setCantidadGasolina(int cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void TotalPagarGasolina() {
        if (Tipo.equals("Ecopais")) {
            costo = cantidadGasolina * 2.40;
        } else if (Tipo.equals("Extra")) {
            costo = cantidadGasolina * 2.40;
        } else if (Tipo.equals("Diesel")) {
            costo = cantidadGasolina * 1.75;
        }
    }

    public String ToString() {
        return "TOTAL DE LA GASOLINA" + "\n"
                + "Tipo de Gasolina: " + Tipo + "\n"
                + "Cantidad de Gasolina : " + cantidadGasolina + " (Unidades) " + "\n"
                + "Costo: " + costo + " $";
    }
}
