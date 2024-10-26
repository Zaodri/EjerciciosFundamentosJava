/*
*Ejemplo de encapsulamiento desde el mismo package
*/
package lostrescerditos;

/**
 *
 * @author zaodri
 */
public class PruebaDeLosCerditos {
    public static void main(String[] args) {
        
        LosTresCerditos cerditos = new LosTresCerditos();
        cerditos.setNombreCerdito("Pepa");
        cerditos.SetColorCerdito("Lila");
        cerditos.setGeneroCerdito("Hembra");
        cerditos.setAnioCerdito(5);
        cerditos.setPesoCerdito(4.5);
        System.out.println("Caracteristicas del cerdio: ");
        System.out.println("Nombre = " + cerditos.getNombreCerdito());
        System.out.println("Color = " + cerditos.getColorCerdito());
        System.out.println("Genero = " + cerditos.getGeneroCerdito());
        System.out.println("Años = " + cerditos.getAnioCerdito());
        System.out.println("Peso = " + cerditos.getPesoCerdito() + " Kilos");
    
//        //Sin utilizar get and set
//        LosTresCerditos cerditos = new LosTresCerditos("pepe  ", "rosa ", "macho ", 6, 8.3);
//        cerditos.caracCerdito();      
    }
}
