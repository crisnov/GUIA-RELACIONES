/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaperro;

import personaperro.entidades.Persona;
import personaperro.servicio.ServicioPersonaPerro;

/**
 *
 * @author crist
 */
public class PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
        
        ServicioPersonaPerro sp = new ServicioPersonaPerro();
        Persona p1 = sp.crearPersona();
        System.out.println(p1);
        
        Persona p2 = sp.crearPersona();
        System.out.println(p2);
        
    }
    
}
