package Entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    
    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("---Televisor---");
        super.crearElectrodomestico();
        System.out.print("Pulgadas: ");
        this.resolucion = leer.nextDouble();
        System.out.print("Sintonizador TDT (true/false): ");
        this.sintonizadorTDT = leer.nextBoolean(); 
   
    }

    public void precioFinalTelevisor(){
        
        super.precioFinal();       
        if (this.resolucion >= 40) {
            this.precio += this.precio * 0.3;
        }
        if (this.sintonizadorTDT == true) {
            this.precio += 500;
        }
          
    }

    @Override
    public String toString() {
        return "Televisor{" + "color = " + color + ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso + ", resolucion = " + resolucion + ", sintonizadorTDT = " + sintonizadorTDT + '}';
    }
    
}
