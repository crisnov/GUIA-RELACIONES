/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35.servicios;

import java.util.Locale;
import java.util.Scanner;
import javaapplication35.entidades.Dos;
import javaapplication35.entidades.Uno;

/**
 *
 * @author crist
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Dos matriz[][];
    Uno n = new Uno();

    public Dos ingresarFyC() {

        int filas = leer.nextInt();

        int columnas = leer.nextInt();

        return new Dos(filas, columnas);
    }

    public void rellenarMatriz() {

        Dos s = ingresarFyC();

        matriz = new Dos[s.getFilas()][s.getColumnas()];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = new Dos(5, 5);
            }
        }

        n.setMatriz(matriz);
        System.out.println(n);

//System.out.println(n.getMatriz()[0].length);

//for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                System.out.print("[" + matriz[i][j] + "]");
//            }
//            System.out.println("");
//        }
//    }
    }
    
    public void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("" + matriz[i][j] + "");
            }
            System.out.println("");
        }
    }
    }
