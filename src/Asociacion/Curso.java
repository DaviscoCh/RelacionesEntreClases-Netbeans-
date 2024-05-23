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
public class Curso {

    private String codigo_curso;
    private String cant_pupitres;
    private Estudiantes estudiante;
    private Maestro maestro;

    public Curso() {
    }

    public Curso(String codigo_curso, String cant_pupitres, Estudiantes estudiante, Maestro maestro) {
        this.codigo_curso = codigo_curso;
        this.cant_pupitres = cant_pupitres;
        this.estudiante = estudiante;
        this.maestro = maestro;
    }

    public String getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getCant_pupitres() {
        return cant_pupitres;
    }

    public void setCant_pupitres(String cant_pupitres) {
        this.cant_pupitres = cant_pupitres;
    }

    public Estudiantes getestudiante() {
        return estudiante;
    }

    public void setestudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Maestro getmaestro() {
        return maestro;
    }

    public void setmaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public String realizarEvaluacion() {
        return "Los estudiantes proceden a realizar la evaluacion dentro del curso";
    }

    public String CalificarNotas() {
        return "Los Profesores " + maestro.getNombre() + " se encargan de calificar los trabajos a los estudiantes en el curso";
    }
}
