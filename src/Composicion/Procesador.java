/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicion;

/**
 *
 * @author Charlie Cordova
 */
public class Procesador extends Computadora {
    private int Nucleos;
    private String ControladorMemoria;
    private String TarjetaGrafica;

    public Procesador() {
    }

    public Procesador(int Nucleos, String ControladorMemoria, String TarjetaGrafica, DiscoDuro discoduro, Procesador procesador) {
        super(discoduro, procesador);
        this.Nucleos = Nucleos;
        this.ControladorMemoria = ControladorMemoria;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public int getNucleos() {
        return Nucleos;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public String getControladorMemoria() {
        return ControladorMemoria;
    }

    public void setControladorMemoria(String ControladorMemoria) {
        this.ControladorMemoria = ControladorMemoria;
    }

    public String getTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(String TarjetaGrafica) {
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public String EjecutarAcciones(){
        return "Se Ejecutaran las intrucciones de los programas del computador";
    }   
}
