package Entidad;

import java.util.Scanner;

public class Rectangulo implements calculosFormas {

    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("---RECTANGULO---");
        System.out.print("Base: ");
        this.base = leer.nextDouble();
        System.out.print("Altura: ");
        this.altura = leer.nextDouble();
        
    }
    
    @Override
    public void area() {       
        double area = base * altura;
        System.out.println("Área: " + area);       
    }

    @Override
    public void perimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("Perímetro: " + perimetro);
    }
     
}
