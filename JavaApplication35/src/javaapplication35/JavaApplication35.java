/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import javaapplication35.servicios.Servicio;

/**
 *
 * @author crist
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String matriz[][];
//        matriz = new String[3][3];

        Servicio q = new Servicio();
        // q.ingresarFyC();
        q.rellenarMatriz();
        q.mostrarMatriz();
        System.out.println("-----------");
        q.rellenarMatriz();
        q.mostrarMatriz();
    }
}
