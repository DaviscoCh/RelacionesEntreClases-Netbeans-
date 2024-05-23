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
public class Baloncesto extends Deporte{
    private String Cancha;

    public Baloncesto() {
    }

    public Baloncesto(String Cancha) {
        this.Cancha = Cancha;
    }

    public Baloncesto(String Cancha, String Nombre, int Jugadores) {
        super(Nombre, Jugadores);
        this.Cancha = Cancha;
    }

    public String getCancha() {
        return Cancha;
    }

    public void setCancha(String Cancha) {
        this.Cancha = Cancha;
    }
    
    public String hacerCanasta() {
        return "Haciendo una canasta en la cancha de " + Cancha;
    }
}
