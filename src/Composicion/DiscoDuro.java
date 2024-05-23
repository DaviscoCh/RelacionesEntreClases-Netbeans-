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
public class DiscoDuro extends Computadora {

    private String Platos;
    private String Motor;
    private String Cabezal;

    public DiscoDuro() {
    }

    public DiscoDuro(String Platos, String Motor, String Cabezal, DiscoDuro discoduro, Procesador procesador) {
        super(discoduro, procesador);
        this.Platos = Platos;
        this.Motor = Motor;
        this.Cabezal = Cabezal;
    }

    public String getPlatos() {
        return Platos;
    }

    public void setPlatos(String Platos) {
        this.Platos = Platos;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getCabezal() {
        return Cabezal;
    }

    public void setCabezal(String Cabezal) {
        this.Cabezal = Cabezal;
    }

    public String AlmacenarInformacion() {
        return "A travez de los " + Platos + " se grabaran y posteriormente guardara informacion en la memoria";
    }

    public String RecuperarInformacion() {
        return "A travez de distintos metodos y sistemas preparados para estas " + "\n"
                + "situciones, el ordenador se dispondra a recuprar informacion ya peridda";
    }
}
