/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/
package ejercicio03;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {

    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList();
        
        Lavadora l1 = new Lavadora(10, 1500, "AZUL", 'C', 70);
        Lavadora l2 = new Lavadora(40, 3000, "BLANCO", 'A', 90);
        
        Televisor t1 = new Televisor(90d, true, 2000, "NEGRO", 'C', 50);       
        Televisor t2 = new Televisor(50d, false, 800, "GRIS", 'F', 20);
        
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        
        int sumaPrecios = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico);
            electrodomestico.precioFinal();
            System.out.println("Precio Final $" + electrodomestico.getPrecio());
            System.out.println("");
            sumaPrecios += electrodomestico.getPrecio();
        }
        
        System.out.println("Suma de todos los precios de los electrodomésticos: ");
        System.out.println("$" + sumaPrecios);
        
    }
    
}
