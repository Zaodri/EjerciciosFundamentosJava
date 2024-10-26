/* Ejemplo de herencia desde el package domain con clase Persona, 
* la clase Empleado y la clase Cliente, 
*  y el package test con la clase TestHerencia
*/
package test;

import clases.Persona;
import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

/**
 *
 * @author Zaodri
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        
//        Empleado empleUno = new Empleado("Adriana Rico", 3000.000);
//        System.out.println("empleUno = " + empleUno);
//        
          var fecha = new Date();
////        Cliente clientUno = new Cliente(fecha, true, "Javier Rodríguez", "F", 28, "Sábado");
//
//        Persona perUno = new Persona();
//        System.out.println("perUno = " + perUno);
    
//    Empleado empleUno = new Empleado("Adriana", 3000000);
//        System.out.println("empleUno = " + empleUno);

    Cliente clienteUno = new Cliente(new Date(), true, " Adriana", 'F', 28, " cll 28");
        System.out.println("clienteUno = " + clienteUno);
    }
    
}
