/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog5_R.E.C_Clases;

/**
 *
 * @author Charlie Cordova
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String idCedula;
    private String Sexo;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String idCedula, String Sexo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.idCedula = idCedula;
        this.Sexo = Sexo;
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

    public String getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(String idCedula) {
        this.idCedula = idCedula;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public String ToString(){
        return "Nombre del Chofer: " + Nombre + "\n" +
               "Apellido del Chofer: " + Apellido + "\n" + 
               "idCedula: " + idCedula + "\n" + 
               "Sexo: " + Sexo;
    }
}
