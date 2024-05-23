/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregacion;

import java.util.Date;

/**
 *
 * @author Charlie Cordova
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Periodista y Camarografo
        Periodista pe = new Periodista("Javier", "Medina", "Masculino", null, null);
        Camarografo ca = new Camarografo("Maria", "Espinoza", "Femenino", null, null);

        Acontecimiento ac = new Acontecimiento(new Date(), "Parque Central", "Accidente de transito", ca, pe);
        ca.setGrabarAcontecimiento(ac);
        pe.setReportar(ac);

        System.out.println("Descripción del Acontecimiento:");
        System.out.println("Fecha: " + ac.getFecha());
        System.out.println("Lugar: " + ac.getLugar());
        System.out.println("Contexto: " + ac.getContexto());
        System.out.println("Descripción de la relación:");
        System.out.println(ac.Describirlo());

        System.out.println("\nDescripción del Periodista:");
        System.out.println("Nombre: " + pe.getNombre());
        System.out.println("Apellido: " + pe.getApellido());
        System.out.println("Sexo: " + pe.getSexo());
        System.out.println("Descripción de la relación:");
        System.out.println(pe.SintetizarlaInformacion());

        System.out.println("\nDescripción del Camarógrafo:");
        System.out.println("Nombre: " + ca.getNombre());
        System.out.println("Apellido: " + ca.getApellido());
        System.out.println("Sexo: " + ca.getSexo());
        System.out.println("Descripción de la relación:");
        System.out.println(ca.RegistrarlaNoticia());
    }
}
