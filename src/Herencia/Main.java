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
public class Main {

    public static void main(String[] args) {
        Baloncesto baloncesto = new Baloncesto("CanchaBaloncesto", "Baloncesto", 5);
        Futbol futbol = new Futbol("EstadioFutbol", "Futbol", 11);

        System.out.println("Descripción del Baloncesto:");
        System.out.println("Nombre del Deporte: " + baloncesto.getNombre());
        System.out.println("Cantidad de Jugadores: " + baloncesto.getJugadores());
        System.out.println("Tipo de Cancha: " + baloncesto.getCancha());
        System.out.println("Descripción de la herencia:");
        System.out.println(baloncesto.ToString());
        System.out.println(baloncesto.hacerCanasta());

        System.out.println("\nDescripción del Futbol:");
        System.out.println("Nombre del Deporte: " + futbol.getNombre());
        System.out.println("Cantidad de Jugadores: " + futbol.getJugadores());
        System.out.println("Estadio: " + futbol.getEstadio());
        System.out.println("Descripción de la herencia:");
        System.out.println(futbol.ToString());
        System.out.println(futbol.HacerunGol());
    }
}
