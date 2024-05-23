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
public class Computadora {
    private DiscoDuro discoduro;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(DiscoDuro discoduro, Procesador procesador) {
        this.discoduro = discoduro;
        this.procesador = procesador;
    }

    public DiscoDuro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(DiscoDuro discoduro) {
        this.discoduro = discoduro;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    
    public String Encender(){
        return "Se inician todos los sistemas y funciones del computador";
    }
    
    public String Operar(){
        return "Se pondra en marcha el " + discoduro.getPlatos() + " y el " + procesador.getNucleos() + "para comenzar a operar el computador";
    }
    
    public String Apagar(){
        return "Se apagaran todas las funciones y sistemas de la computadora";
    }
    
    
}
