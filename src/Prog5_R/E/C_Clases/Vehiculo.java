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
public class Vehiculo {
    private String Marca;
    private String Placa;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Placa) {
        this.Marca = Marca;
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    public String ToString(){
        return "Marca del Taxi que lo movilizara: " + Marca + "\n" + 
               "Placa del Taxi que lo movilizara: " + Placa;
    }
}
