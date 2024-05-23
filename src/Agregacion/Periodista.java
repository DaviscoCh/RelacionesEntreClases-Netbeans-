/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregacion;

/**
 *
 * @author Charlie Cordova
 */
public class Periodista {
    private String Nombre;
    private String Apellido;
    private String sexo;
    private Acontecimiento reportar;
    private Camarografo camarografo;

    public Periodista() {
    }

    public Periodista(String Nombre, String Apellido, String sexo, Acontecimiento reportar, Camarografo camarografo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.sexo = sexo;
        this.reportar = reportar;
        this.camarografo = camarografo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Acontecimiento getReportar() {
        return reportar;
    }

    public void setReportar(Acontecimiento reportar) {
        this.reportar = reportar;
    }

    public Camarografo getCamarografo() {
        return camarografo;
    }

    public void setCamarografo(Camarografo camarografo) {
        this.camarografo = camarografo;
    }
    
    public String SintetizarlaInformacion(){
        return "El Periodista" + this.Nombre + "analizara y resumira el" + reportar.getContexto() + "para posteriormente trasmitirla";
    }
    
    public String Documentar(){
        return "Documentar la noticia a detalle";
    }
}
