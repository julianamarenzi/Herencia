/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
*/
package ejercicio02;

import Entidad.Lavadora;
import Entidad.Televisor;

public class Ejercicio02 {

    public static void main(String[] args) {
       
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        System.out.println("Precio Final: $" + l.getPrecio());
        System.out.println(l.toString());
        
        System.out.println("");
        Televisor t = new Televisor();
        t.crearTelevisor();
        t.precioFinalTelevisor();
        System.out.println("Precio Final: $" + t.getPrecio());
        System.out.println(t.toString());

    }
    
}
