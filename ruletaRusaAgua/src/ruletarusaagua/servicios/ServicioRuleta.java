/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaagua.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import ruletarusaagua.entidades.Juego;
import ruletarusaagua.entidades.Jugador;
import ruletarusaagua.entidades.RevolverDeAgua;

/**
 *
 * @author crist
 */
public class ServicioRuleta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Jugador> conjuntoJugadores;

    public ServicioRuleta() {
        this.conjuntoJugadores = new ArrayList();
    }

    public Jugador crearJugador() {
        System.out.println("Ingrese ID: ");
        String id = leer.next();

        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();

        Boolean mojado = false;

        return new Jugador(id, nombre, mojado);
    }

    public void agregarJugador(Jugador j) {
        conjuntoJugadores.add(j);
    }

    public void crearVariosJugadores() {
        String opcion;

        do {
            Jugador n = crearJugador();
            agregarJugador(n);
            System.out.println("----------------------------------------");
            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Crear y agregar otro jugador");
            System.out.println("----------------------------------------");

            opcion = leer.next();

        } while (!opcion.equals("1"));
    }

    public RevolverDeAgua crearRevolver() {
        System.out.println("Posicion actual del tambor: ");
        Integer posActual = 0;

        System.out.println("Posicion donde se encuentra agua: ");
        Integer posAgua = 0;

        return new RevolverDeAgua(posActual, posAgua);
    }

    /**
     * le pone los valores de posición actual y de posición del agua. Los
     * valores deben ser aleatorios
     *
     * @param r
     */
    public void llenarRevolver(RevolverDeAgua r) {
        System.out.println("A continuacion se cargara el revolver: ");

        System.out.println("Posicion Actual: ");
        r.setPosicionActual((int) ((Math.random() * 6) + 1));
        System.out.println(r.getPosicionActual());

        System.out.println("Posicion Agua: ");
        r.setPosicionAgua((int) ((Math.random() * 6) + 1));
        System.out.println(r.getPosicionAgua());
    }

    /**
     * devuelve true si la posición del agua coincide con la posición actual
     *
     * @param r
     * @return
     */
    public boolean mojar(RevolverDeAgua r) {
        boolean x = false;
        if (r.getPosicionAgua() == r.getPosicionActual()) {
            System.out.println("Posiciones coincidentes");
            x = true;
        } else {
            System.out.println("Posiciones no coindentes");
        }
        return x;
    }

    /**
     * cambia a la siguiente posición del tambor
     *
     * @param r
     */
    public void sigDisparo(RevolverDeAgua r) {
        if (r.getPosicionActual() == 6) {
            r.setPosicionActual(1);
        } else {
            r.setPosicionActual((r.getPosicionActual() + 1));
        }
    }

    /**
     * muestra información del revolver (posición actual y donde está el agua)
     *
     * @param r
     */
    public void infoRevolver(RevolverDeAgua r) {
        System.out.println(r);
    }

    /**
     * el método, recibe el revolver de agua y llama a los métodos de mojar() y
     * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y
     * si el revolver tira el agua, el jugador se moja. El atributo mojado pasa
     * a false y el método devuelve true, sino false.
     *
     * @param r
     */
    public boolean disparo(RevolverDeAgua r) {
        boolean q=false;

        if (!mojar(r)) {
            System.out.println("a continuacion se realizara el disparo");
            sigDisparo(r);
        } else {
            System.out.println("JUGADOR MOJADO. FIN DEL JUEGO");
            q = true;
        }
       
        return q;
    }

    public void llenarJuego(ArrayList<Jugador> conjuntoJugadores, RevolverDeAgua r) {
        System.out.println("Crearemos un juego");
        Juego j1 = new Juego();
        llenarRevolver(r);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        j1.setJugadores(conjuntoJugadores);
        j1.setRevolver(r);
    }

    /**
     * cada ronda consiste en un jugador que se apunta con el revolver de agua y
     * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se
     * termina el juego, sino se moja, se pasa al siguiente jugador hasta que
     * uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
     * debe mostrar que jugador se mojó. Pensar la lógica necesaria para
     * realizar esto, usando los atributos de la clase Juego.
     */
    public void ronda() {

        crearVariosJugadores();
        RevolverDeAgua r = crearRevolver();
        llenarJuego(conjuntoJugadores, r);

        boolean x = false;
        Jugador n = null;

        do {

            for (Jugador cadaJugador : conjuntoJugadores) {

                cadaJugador.setMojado(disparo(r));

                if (cadaJugador.getMojado()) {
                    x = true;
                    n = cadaJugador;
                    break;

                } else {
                    //sigDisparo(r);
                    System.out.println("Posicion del gatillo: " + r.getPosicionActual());
                }
            }
        } while (!x);

        System.out.println("Juego finalizado");
        System.out.println(n);

    }

}
