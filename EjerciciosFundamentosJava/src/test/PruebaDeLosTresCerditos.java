/*
*Ejemplo de encapsulamiento desde package diferente "package dominio y  package test
*/
package test;
import dominio.LosTresCerditos;
/**
 *
 * @author Zaodri
 */
public class PruebaDeLosTresCerditos {
    
    public static void main(String[] args) {
        
        LosTresCerditos cerditos = new LosTresCerditos();
        cerditos.setNombreCerdito("Pako");
        cerditos.setColorCerdito("Verde");
        cerditos.setGeneroCerdito("Macho");
        cerditos.setEdadCerdito(2);
        cerditos.setPesoCerdito(3.2);
        
        //Imprimir de manera individual
        System.out.println("Imprimiendo individual");
        System.out.println("Nombre del cerdito: " + cerditos.getNombreCerdito());
        System.out.println("Color del cerdito: " + cerditos.getColorCerdito());
        System.out.println("Genero del cerdito: " + cerditos.getGeneroCerdito());
        System.out.println("Edad del cerdito: " + cerditos.getEdadCerdito());
        System.out.println("Peso del cerdito: " + cerditos.getPesoCerdito());
        System.out.println("***************************");
        
        //Imprimir utilizando el metodo toString
        System.out.println("Imprimiendo con el método .toString");
        System.out.println("cerditos = " + cerditos.toString());//No es necesario escribir .toStrin ya que el compilador lo entiende automaticamente
        
        System.out.println("***************************");
        System.out.println("Imprimiendo con el método toString");
        System.out.println("cerditos = " + cerditos);
    }
    
}
