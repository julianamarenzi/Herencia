/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
    A $1000
    B $800
    C $600
    D $500
    E $300
    F $100

    PESO PRECIO
    Entre 1 y 19 kg $100
    Entre 20 y 49 kg $500
    Entre 50 y 79 kg $800
    Mayor que 80 kg $1000
*/
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
