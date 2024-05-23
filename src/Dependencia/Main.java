/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependencia;

/**
 *
 * @author Charlie Cordova
 */
public class Main {
    public static void main(String[] args) {
        
        Carbon carbon = new Carbon("Vegetal", 0.75);
        Ahumador ahumador = new Ahumador("Pollo", 3, 200.0, carbon);

        System.out.println("Descripción del Ahumador:");
        System.out.println("Tipo de Carne: " + ahumador.getTipoCarne());
        System.out.println("Tiempo de Ahumado: " + ahumador.getTiempoAhumado() + " horas");
        System.out.println("Temperatura: " + ahumador.getTemperatura() + " grados Celsius");
        System.out.println("Descripción de la relación:");
        System.out.println(ahumador.IniciarAhumado());

        System.out.println("\nDescripción del Carbon:");
        System.out.println("Tipo: " + carbon.getTipo());
        System.out.println("Nivel de Combustión: " + carbon.getNivelCombustion());
        System.out.println("Descripción de la relación:");
        System.out.println(carbon.EncenderCarbon());

        carbon.setNivelCombustion(0.95);

        System.out.println("\nDescripción del Ahumador después de cambio en el Carbon:");
        System.out.println("Descripción de la relación:");
        System.out.println(ahumador.DetenerAhumado());
        System.out.println(carbon.ApagarCarbon());
    }
}
