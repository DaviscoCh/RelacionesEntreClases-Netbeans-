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
public class Estudiantes {
    private String Nombre;
    private String Apellido;
    private String idEstudiante;
    private int edad;
    private Curso Curso;

    public Estudiantes() {
    }

    public Estudiantes(String Nombre, String Apellido, String idEstudiante, int edad, Curso Curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.idEstudiante = idEstudiante;
        this.edad = edad;
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

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }
    
    public String Estudiar(){
        return "Estudia para pasar aprender y pasar todas sus materias";
    }
    
    public String Exponer(){
        return "Expone temas importantes en clase";
    }
    
    public String Resolucion_de_Problemas(){
        return "Resuelve problemas tanto dentro como fuera del curso";
    }
}
