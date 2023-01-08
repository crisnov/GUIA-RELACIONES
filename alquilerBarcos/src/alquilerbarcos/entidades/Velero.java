/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerbarcos.entidades;

/**
 *
 * @author crist
 */
public class Velero extends Barco {
    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }
    
    
}
