/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaperro.entidades;

/**
 *
 * @author crist
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String talla;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String talla) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", talla=" + talla + '}';
    }

}
