/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacine.entidades;

/**
 *
 * @author crist
 */
public class Espectadores {
    private String nombre;
    private String edad;
    private Double dineroDisp;

    public Espectadores() {
    }

    public Espectadores(String nombre, String edad, Double dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(Double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Espectadores{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + '}';
    }
    
    
}
