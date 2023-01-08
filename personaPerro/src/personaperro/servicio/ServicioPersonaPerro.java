/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaperro.servicio;

import java.util.Locale;
import java.util.Scanner;
import personaperro.entidades.Perro;
import personaperro.entidades.Persona;

/**
 *
 * @author crist
 */
public class ServicioPersonaPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Perro crearPerro() {

        System.out.println("Ingrese Nombre del Perro: ");
        String nombre = leer.next();
        System.out.println("Ingrese Raza del Perro: ");
        String raza = leer.next();
        System.out.println("Ingrese Edad del Perro: ");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese Tamaño del Perro: ");
        String talla = leer.next();
        System.out.println("----------------------------------------");

        return new Perro(nombre, raza, edad, talla);
    }

    /**
     * Se define a una persona y a un perro, luego se le asigna este ultimo a la
     * Persona.
     *
     * @return
     */
    public Persona crearPersona() {
        System.out.println("----------------------------------------");
        System.out.println("Ingrese Nombre de la Persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese Apellido de la Persona: ");
        String apellido = leer.next();
        System.out.println("Ingrese Edad de la Persona: ");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese Documento de la Persona: ");
        String documento = leer.next();

        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println("A continuacion, ingrese datos del Perro. ");
        System.out.println(" ");

        Perro perro = crearPerro();

        return new Persona(nombre, apellido, edad, documento, perro);
    }

}
