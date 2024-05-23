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
public class Carreras{
    private Choferes choferes;
    private Taxis taxi;
    private String Locacion;
    private String Ubicacion;

    public Carreras() {
    }

    public Carreras(Choferes choferes, Taxis taxi) {
        this.choferes = choferes;
        this.taxi = taxi;
    }

    public Choferes getChoferes() {
        return choferes;
    }

    public void setChoferes(Choferes choferes) {
        this.choferes = choferes;
    }

    public Taxis getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxis taxi) {
        this.taxi = taxi;
    }

    public String getLocacion() {
        return Locacion;
    }

    public void setLocacion(String Locacion) {
        this.Locacion = Locacion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    double total = 0;
    public void proced_CalcularCostoCarrera(){
        if(Locacion.equals("Nivel Local")){
            if(Ubicacion.equals("Parque Central")){
                total = 5;
            }else if(Ubicacion.equals("Museo")){
                total = 10;
            }else if(Ubicacion.equals("Aeropuerto")){
                total = 15;
            }
        }else if(Locacion.equals("Nivel Provincial")){
            if(Ubicacion.equals("Chilla")){
                total = 20;
            }else if(Ubicacion.equals("La Cocha")){
                total = 30;
            }else if(Ubicacion.equals("El Retiro")){
                total = 35;
            }
        }
    }
    
    public String ToString(){
        return "TOTAL A PAGAR" + "\n" + 
                "Locacion: " + Locacion + "\n" + 
                "Ubicacion: " + Ubicacion + "\n" + 
                "Total a pagar: " + total + " $";
    }
}
