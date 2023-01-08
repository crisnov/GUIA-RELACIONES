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
public class Cine {

    private Pelicula peli;
    private Sala sala[][];
    private Double precioEntrada;

    public Cine(Pelicula peli, Sala[][] sala, Double precioEntrada) {
        this.peli = peli;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Sala[][] getSala() {
        return sala;
    }

    public void setSala(Sala[][] sala) {
        this.sala = sala;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala.length + ", precioEntrada=" + precioEntrada + '}';
    }

}
