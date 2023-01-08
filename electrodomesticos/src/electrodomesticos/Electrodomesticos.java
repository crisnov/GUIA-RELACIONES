/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

import electrodomesticos.entidades.Electrodomestico;
import electrodomesticos.entidades.Lavadora;
import electrodomesticos.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electroList = new ArrayList();
        // EJERCICIO 3 GUIA 10 (CONTINUA DESDE EL ANTERIOR, EJ 2)

        //(Double pulgadas, boolean TDT, Double precio, String color, Integer peso, char Consumo)
        Televisor teve = new Televisor();
        Televisor teve1 = new Televisor();
        teve.crearTelevisor();
        teve1.crearTelevisor();
        //Integer Carga, Double precio, String color, Integer peso, char Consumo
        Lavadora lava = new Lavadora();
        Lavadora lava1 = new Lavadora();
        lava.crearLavadora();
        lava1.crearLavadora();

        electroList.add(teve);
        electroList.add(teve1);
        electroList.add(lava);
        electroList.add(lava1);
        double lavaPrecio = 0;
        double tevePrecio = 0;
        for (Electrodomestico aux : electroList) {
            if (aux instanceof Televisor) {
                
                tevePrecio += aux.getPrecio();

            } else {
                lavaPrecio += aux.getPrecio();
            }
        }
        System.out.println("Precio Lavarropas = " + lavaPrecio);
        System.out.println("Precio Televisores = " + tevePrecio);
        System.out.println("Precio Total = " + (lavaPrecio + tevePrecio));
    }

}

//EJERCICIO 2 GUIA 10
//        Lavadora lavaTodo = new Lavadora();
//        Televisor teleTV = new Televisor();
//
//        lavaTodo.crearLavadora();
//        teleTV.crearTelevisor();

        // --------------------------------------------
