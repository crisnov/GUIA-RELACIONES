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
public class Sala {

    private Espectadores espectador;
    private int filas;
    private char letra;

    public Sala(char letra, int filas) {
        this.espectador = null;
        this.filas = filas;    
        this.letra = letra;
    }

    public Espectadores getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectadores espectador) {
        this.espectador = espectador;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Sala{" + "espectador=" + espectador + ", filas=" + filas + ", letra=" + letra + '}';
    }

    
    
    
}
