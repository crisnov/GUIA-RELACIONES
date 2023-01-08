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
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public String comprobarConsumoEnergetico(String letra) {
        if (!(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E"))) {
            letra = "F";
        }
        return letra;
    }

    public String comprobarColor(String color1) {
        if (!(color1.equalsIgnoreCase("blanco") || color1.equalsIgnoreCase("negro") || color1.equalsIgnoreCase("rojo") || color1.equalsIgnoreCase("azul") || color1.equalsIgnoreCase("gris"))) {
            color1 = "BLANCO";
        }
        return color1;
    }

    public void crearElectrodomestico() {
        //System.out.println("Ingrese precio: ");
        Double precio1 = 1000d;

        System.out.println("Ingrese color: ");
        String color2 = leer.next();
        // comprobarColor(color2);

        System.out.println("Ingrese consumo energetico: ");
        String consumEner = leer.next();

        System.out.println("Ingrese peso: ");
        float peso1 = leer.nextFloat();

        this.setPrecio(precio1); /////QUEDA MEJOR ESTA FORMA... CON LOS GET Y SET....
        this.consumoEnergetico = comprobarConsumoEnergetico(consumEner);
        this.color = comprobarColor(color2);
        this.peso = peso1;
    }

    public void precioFinal() {
        Double precioFInal = this.precio;

        switch (this.consumoEnergetico) {
            case "A":
                precioFInal += 1000;
                break;

            case "B":
                precioFInal += 800;
                break;

            case "C":
                precioFInal += 600;
                break;

            case "D":
                precioFInal += 500;
                break;

            case "E":
                precioFInal += 300;
                break;

            case "F":
                precioFInal += 100;
                break;
        }
        if (this.peso <= 19) {
            precioFInal += 100;
        } else if (this.peso > 19 && this.peso <= 49) {
            precioFInal += 500;
        } else if (peso > 49 && peso <= 79) {
            precioFInal += 800;
        } else {
            precioFInal += 1000;
        }

        this.precio = precioFInal;
    }

}
