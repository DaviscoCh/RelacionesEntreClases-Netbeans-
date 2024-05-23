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
public class Carbon {
    private String Tipo;
    private double NivelCombustion;

    public Carbon() {
    }
    
    public Carbon(String Tipo, double NivelCombustion) {
        this.Tipo = Tipo;
        this.NivelCombustion = NivelCombustion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getNivelCombustion() {
        return NivelCombustion;
    }

    public void setNivelCombustion(double NivelCombustion) {
        this.NivelCombustion = NivelCombustion;
    }
    
    public String EncenderCarbon(){
        return "Comenzar con el encendido del carbon";
    }
    
    public String ApagarCarbon(){
        return "Detener la incineracion";
    }
}
