package Entidad;

import java.util.Scanner;

public class Circulo implements calculosFormas {

    protected Double radio;
    protected Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    public void crearCirculo(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("---CIRCULO---");
        System.out.print("Radio: ");
        this.radio = leer.nextDouble();
        System.out.print("Diámetro: ");
        this.diametro = leer.nextDouble();
        
    }
    
    @Override
    public void area() {
        double area = PI * (Math.pow(radio, 2));
        System.out.println("Área: " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = PI * diametro;
        System.out.println("Perímetro: " + perimetro);
    }
    
}
