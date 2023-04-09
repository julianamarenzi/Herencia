package Entidad;

import java.util.Scanner;

public class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    public char comprobarConsumoEnergetico(char consumoEnergetico){
        
        if (consumoEnergetico <= 'A' && consumoEnergetico >= 'F') {
            consumoEnergetico = 'F';
        }
        return consumoEnergetico;
        
    }
    
    public String comprobarColor(String color){
        
        if (!(color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") ||
                color.equals("AZUL") || color.equals("GRIS"))) {
            color = "BLANCO";
        }
        return color;
        
    }
    
    public void crearElectrodomestico(){
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Precio: $");
        this.precio = leer.nextInt();
        System.out.print("Color: ");
        this.color = comprobarColor(leer.next().toUpperCase());
        System.out.print("Consumo Energético: ");
        this.consumoEnergetico = comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.print("Peso: ");
        this.peso = leer.nextInt();
                
    }
    
    public void precioFinal(){
        
        switch(this.consumoEnergetico){
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        } else if (this.peso >= 80){
            this.precio += 1000;
        }
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
   
}
