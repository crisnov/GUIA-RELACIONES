/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos.entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Lavadora extends Electrodomestico {
   private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, String consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    public void crearLavadora(){
        Scanner leerLavadora = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        crearElectrodomestico();
        System.out.println("Ingrese la carga en kg....");
        this.setCarga(leerLavadora.nextInt());
        precioFinal();
    }
   
    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (this.getCarga()>30) {
            this.setPrecio(this.getPrecio()+500);
        }
        System.out.println("El precio Final de LAVARROPA  es.... $ "+this.getPrecio());
        System.out.println("Los otros Datos son....");
        System.out.println("COLOR..."+this.getColor());
        System.out.println("CONSUMO..."+this.getConsumoEnergetico());
        System.out.println("PESO..."+this.getPeso());
        System.out.println("CARGA..."+this.getCarga());
        
        
    }
}
