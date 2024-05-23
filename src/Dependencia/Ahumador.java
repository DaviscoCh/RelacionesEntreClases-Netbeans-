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
public class Ahumador {
    private String TipoCarne;
    private int TiempoAhumado;
    private double Temperatura;
    private Carbon carbon;

    public Ahumador() {
    }

    public Ahumador(String TipoCarne, int TiempoAhumado, double Temperatura, Carbon carbon) {
        this.TipoCarne = TipoCarne;
        this.TiempoAhumado = TiempoAhumado;
        this.Temperatura = Temperatura;
        this.carbon = carbon;
    }

    public String getTipoCarne() {
        return TipoCarne;
    }

    public void setTipoCarne(String TipoCarne) {
        this.TipoCarne = TipoCarne;
    }

    public int getTiempoAhumado() {
        return TiempoAhumado;
    }

    public void setTiempoAhumado(int TiempoAhumado) {
        this.TiempoAhumado = TiempoAhumado;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    public Carbon getCarbon() {
        return carbon;
    }

    public void setCarbon(Carbon carbon) {
        this.carbon = carbon;
    }
    
    public String IniciarAhumado(){
        return "Iniciamos el proceso de ahumado con el " + carbon.getTipo();
    }
    
     public String DetenerAhumado(){
        return "Detenemos el proceso de ahumado, debido a que el " 
                + TiempoAhumado + " y " + Temperatura + 
                " han excedido las condicioens establecidas";
    }
}
