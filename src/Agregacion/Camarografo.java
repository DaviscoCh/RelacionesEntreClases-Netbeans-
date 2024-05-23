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
public class Camarografo {
    private String Nombre;
    private String Apellido;
    private String sexo;
    private Periodista grabarPeriodista;
    private Acontecimiento grabarAcontecimiento;

    public Camarografo() {
    }

    public Camarografo(String Nombre, String Apellido, String sexo, Periodista grabarPeriodista, Acontecimiento grabarAcontecimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.sexo = sexo;
        this.grabarPeriodista = grabarPeriodista;
        this.grabarAcontecimiento = grabarAcontecimiento;
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

    public Periodista getGrabarPeriodista() {
        return grabarPeriodista;
    }

    public void setGrabarPeriodista(Periodista grabarPeriodista) {
        this.grabarPeriodista = grabarPeriodista;
    }

    public Acontecimiento getGrabarAcontecimiento() {
        return grabarAcontecimiento;
    }

    public void setGrabarAcontecimiento(Acontecimiento grabarAcontecimiento) {
        this.grabarAcontecimiento = grabarAcontecimiento;
    }
    
    public String RegistrarlaNoticia(){
        return "El camarorafo servira como un transmisor para que la noticia llegue a la comunidad";
    }
    
    public String Editar(){
        return "Edita la noticia de modo que llegue lo mas relevante a nosotros y lo irrelevante es desechado";
    }
}
