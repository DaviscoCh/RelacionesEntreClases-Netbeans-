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
public class Deporte {
    private String Nombre;
    private int Jugadores;

    public Deporte() {
    }

    public Deporte(String Nombre, int Jugadores) {
        this.Nombre = Nombre;
        this.Jugadores = Jugadores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getJugadores() {
        return Jugadores;
    }

    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
    }
    
    public String ToString(){
        return "Todo el equipo se ecuentra jugando " + Nombre;
    }
}
