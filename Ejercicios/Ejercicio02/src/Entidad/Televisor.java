/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
*/
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
        return "Televisor{" + "precio final = " + precio + ", color = " + color + ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso + ", resolucion = " + resolucion + ", sintonizadorTDT = " + sintonizadorTDT + '}';
    }
    
}
