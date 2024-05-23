/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Charlie Cordova
 */
public class Futbol extends Deporte{
    private String estadio;

    public Futbol() {
    }

    public Futbol(String estadio, String Nombre, int Jugadores) {
        super(Nombre, Jugadores);
        this.estadio = estadio;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    public String HacerunGol(){
        return "Acaban de meter un gol en el estadio " + estadio;
    }
    
}
