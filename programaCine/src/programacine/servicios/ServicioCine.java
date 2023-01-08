/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacine.servicios;

import java.util.Locale;
import java.util.Scanner;
import programacine.entidades.Cine;
import programacine.entidades.Pelicula;
import programacine.entidades.Sala;
import programacine.entidades.Espectadores;

/**
 *
 * @author crist
 */
public class ServicioCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
   
    
    public Sala crearSala() {
        char letra = 'A';
        System.out.println("Ingrese dimension filas:");
        int filas = leer.nextInt();
        return new Sala(letra, filas);
    }

    public Sala[][] rellenarSala() {
        //Sala s = crearSala();
        
        //char letra = s.getLetra();
       // Sala[][] sala = new Sala[s.getFilas()][];
       
        int fila = sala.length;
       
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                sala[i][j] = new Sala ((char) ('A'+j), s.getFilas());
               
            }
            fila--;
        }
        return sala;
    }
    
    
    
    public boolean hayLugar(Sala[][] sala, Sala s) {
        boolean q = false;

         for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                
                if(s.getEspectador() == null){
                    q=true;
                }
            }
            
        }
        
        return q;
    }

    public boolean hayLugarSala(Sala[][] sala, Sala s){
       boolean x = false;
       
       return x;
    }
    
    
}
