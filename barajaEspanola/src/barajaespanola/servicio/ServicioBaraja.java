/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajaespanola.servicio;

import barajaespanola.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    List<Carta> barajaDeCartas = new ArrayList();
    String palos[] = {"ESPADA", "ORO", "BASTO", "COPA"};
    List<Carta> cartasDescartadas = new ArrayList();

    public Carta crearCarta(int j, int k) {
        Integer num;

        //System.out.println("Ingrese numero de la carta: ");
        num = k;

        // System.out.println("Ingrese el palo de la carta: ");
        String palo = palos[j];

        return new Carta(num, palo);
    }

    public void agregarCarta(Carta e) {
        barajaDeCartas.add(e);
    }

    public void crear40cartas() {

        for (int j = 0; j < 4; j++) {
            for (int k = 1; k < 13; k++) {
                if (k != 8 && k != 9) {
                    Carta r = crearCarta(j, k);
                    agregarCarta(r);
                    System.out.println(r.toString());
                }
            }
        }
    }

    public void mostrarBarajas() {
        System.out.println("---------------------------------------------");
        System.out.println("Se mostraran las cartas del mazo:");
        System.out.println(" ");
        barajaDeCartas.forEach((elemento) -> {
            System.out.println(elemento);
        });
        System.out.println(" ");
        System.out.println("---------------------------------------------");
    }

    public void barajar() {
        System.out.println("A continuacion se cambiara de posicion aleatoriamente las cartas");
        Collections.shuffle(barajaDeCartas);
        System.out.println(" ");
        System.out.println("Se mostraran las cartas del mazo luego de barajar");
        System.out.println(" ");
        barajaDeCartas.forEach((elemento) -> {
            System.out.println(elemento);
        });
        System.out.println(" ");
    }

    /**
     * devuelve la siguiente carta que está en la baraja, cuando no haya más o
     * se haya llegado al final, se indica al usuario que no hay más cartas
     */
    public void siguienteCarta() {
        if (!barajaDeCartas.isEmpty()) {
            System.out.println("Carta siguiente: " + barajaDeCartas.get(0));
            cartasDescartadas.add(barajaDeCartas.get(0));
            barajaDeCartas.remove(0);
        } else {
            System.out.println("Ya no quedan cartas disponibles :(");
        }
    }

    public void cartasDisponibles() {
        System.out.println("---------------------------------------------");
        System.out.println("La cantidad de cartas disponibles es : " + barajaDeCartas.size());
        System.out.println(" ");
        System.out.println("---------------------------------------------");
    }

    public void darCartas() {
        System.out.println("Ingrese cantidad de cartas a dar: ");
        int cant = leer.nextInt();

        if (barajaDeCartas.size() > cant) {
            for (int i = 0; i < cant; i++) {
                System.out.println("Carta " + (i + 1) + " de " + cant + " es... " + barajaDeCartas.get(0));
                cartasDescartadas.add(barajaDeCartas.get(0));
                barajaDeCartas.remove(0);
            }
        } else {
            System.out.println("No se puede repartir esa cantida de cartas :(");
        }
    }
    
    public void cartasMonton(){
        if (!cartasDescartadas.isEmpty()){
            System.out.println("Las cartas que han salido son: ");
            cartasDescartadas.forEach((elemento) -> {
                System.out.println(elemento);
            });
        } else {
            System.out.println("No hay ninguna carta descartada");
        }
    }

}

