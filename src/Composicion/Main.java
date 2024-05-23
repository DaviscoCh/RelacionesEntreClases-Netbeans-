/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicion;

/**
 *
 * @author Charlie Cordova
 */
public class Main {
    public static void main(String[] args) {
        DiscoDuro discoDuro = new DiscoDuro("PlatosModelo123", "MotorVeloz", "CabezalAvanzado", null, null);
        Procesador procesador = new Procesador(8, "ControladorUltraRápido", "TarjetaPotente", null, null);

        Computadora computadora = new Computadora(discoDuro, procesador);
        discoDuro.setDiscoduro(discoDuro);
        procesador.setProcesador(procesador);

        // Verificar la relación
        System.out.println("Descripción de la Computadora:");
        System.out.println("Descripción de la relación:");
        System.out.println(computadora.Encender());
        System.out.println(computadora.Operar());
        System.out.println(computadora.Apagar());

        System.out.println("\nDescripción del Disco Duro:");
        System.out.println("Descripción de la relación:");
        System.out.println(discoDuro.AlmacenarInformacion());
        System.out.println(discoDuro.RecuperarInformacion());

        System.out.println("\nDescripción del Procesador:");
        System.out.println("Descripción de la relación:");
        System.out.println(procesador.EjecutarAcciones());
    }
}
