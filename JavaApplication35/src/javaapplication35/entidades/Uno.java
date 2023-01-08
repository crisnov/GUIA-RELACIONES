/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35.entidades;

/**
 *
 * @author crist
 */
public class Uno {
    private Dos matriz[][];

    public Uno() {
    }

    public Uno(Dos[][] matriz) {
        this.matriz = matriz;
    }

    public Dos[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Dos[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Uno{" + "matriz = " + matriz.length +" x "+matriz[0].length+ '}';
    }

    
    
}
