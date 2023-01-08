/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos.entidades;

/**
 *
 * @author crist
 */
public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT = false;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, String consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //Scanner leerTelevisor = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void crearTelevisor(){
        crearElectrodomestico();
        
        System.out.println("Ingrese Resolucion en pulgadas");
        this.setResolucion(leer.nextInt());
        
        System.out.println("Tiene Sitonizador TDT S o s = SI");
        String opcionTDT = leer.next();
        if(opcionTDT.equalsIgnoreCase("S")){
            this.setSintonizadorTDT(true);            
        }
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(this.getResolucion()>40){
            this.setPrecio(this.getPrecio()*1.3);
        }
        if(this.isSintonizadorTDT()){
            this.setPrecio(this.getPrecio()+500);
        }
        System.out.println("El precio Final del TV es.... $ "+this.getPrecio());
        System.out.println("Los otros Datos son....");
        System.out.println("COLOR..."+this.getColor());
        System.out.println("CONSUMO..."+this.getConsumoEnergetico());
        System.out.println("PESO..."+this.getPeso());
        System.out.println("RESOLUCION..."+this.getResolucion());
        System.out.println("TDT..."+this.isSintonizadorTDT());
        
    }
}
