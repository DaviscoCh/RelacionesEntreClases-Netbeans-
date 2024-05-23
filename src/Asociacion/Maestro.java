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
public class Maestro {
    private String Nombre;
    private String Apellido;
    private String idMaestro;
    private String Telefono;
    private Curso Curso;

    public Maestro() {
    }

    public Maestro(String Nombre, String Apellido, String idMaestro, String Telefono, Curso Curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.idMaestro = idMaestro;
        this.Telefono = Telefono;
        this.Curso = Curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }
    
    public String Enseñar(){
        return "Enseña su materia a sus estudiantes";
    }
    
    public String Corregir(){
        return "Corrige si el alumno se equivoca en algun problema";
    }
    
    public String Educar(){
        return "Educa a sus estudiante para sus carreras y para la vida";
    }
}
