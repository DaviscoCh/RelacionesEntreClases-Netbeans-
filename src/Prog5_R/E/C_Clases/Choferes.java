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
public class Choferes extends Persona {
    private String Licencia;
    private int añosExperiencia;

    public Choferes() {
    }

    public Choferes(String Licencia, int añosExperiencia, String Nombre, String Apellido, String idCedula, String Sexo) {
        super(Nombre, Apellido, idCedula, Sexo);
        this.Licencia = Licencia;
        this.añosExperiencia = añosExperiencia;
    }

    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public String ToString(){
        return "Licencia del Chofer: " + Licencia + "\n" + 
               "Años de Experiencia: " + añosExperiencia + " años";
    }
}
