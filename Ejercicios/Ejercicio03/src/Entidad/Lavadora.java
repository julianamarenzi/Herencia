package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
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
        
        Scanner leer = new Scanner(System.in);
        System.out.println("---Lavadora---");
        super.crearElectrodomestico();
        System.out.print("Carga: ");
        this.carga = leer.nextInt();
        
    }

    @Override
    public void precioFinal(){
        
        super.precioFinal();
        if (this.carga >= 30) {
            this.precio += 500;
        }
        
    }

    @Override
    public String toString() {
        return "Lavadora{" + "color = " + color + ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso + ", carga = " + carga + '}';
    }
    
    
 
}
