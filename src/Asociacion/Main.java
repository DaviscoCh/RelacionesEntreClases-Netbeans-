/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociacion;

/**
 *
 * @author Charlie Cordova
 */
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("C001", "30", null, null);

        Estudiantes estudiante = new Estudiantes("Jorge", "Ortega", "E001", 20, curso);
        curso.setestudiante(estudiante);

        Maestro maestro = new Maestro("Mario", "Arias", "M001", "123456789", curso);
        curso.setmaestro(maestro);

        System.out.println("Descripción del Curso:");
        System.out.println("Código de Curso: " + curso.getCodigo_curso());
        System.out.println("Cantidad de Pupitres: " + curso.getCant_pupitres());
        System.out.println("Descripción de la relación:");
        System.out.println(curso.realizarEvaluacion());
        System.out.println(curso.CalificarNotas());

        System.out.println("\nDescripción del Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("ID de Estudiante: " + estudiante.getIdEstudiante());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Descripción de la relación:");
        System.out.println(estudiante.Estudiar());
        System.out.println(estudiante.Exponer());
        System.out.println(estudiante.Resolucion_de_Problemas());

        System.out.println("\nDescripción del Maestro:");
        System.out.println("Nombre: " + maestro.getNombre());
        System.out.println("Apellido: " + maestro.getApellido());
        System.out.println("ID de Maestro: " + maestro.getIdMaestro());
        System.out.println("Teléfono: " + maestro.getTelefono());
        System.out.println("Descripción de la relación:");
        System.out.println(maestro.Enseñar());
        System.out.println(maestro.Corregir());
        System.out.println(maestro.Educar());
    }
}
