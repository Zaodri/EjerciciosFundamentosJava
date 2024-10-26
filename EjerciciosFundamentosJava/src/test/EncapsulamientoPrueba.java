
package test;

import dominio.Encapsulamiento;

/**
 *
 * @author Zaodri
 */
public class EncapsulamientoPrueba {
    public static void main(String[] args) {
        Encapsulamiento encapsular = new Encapsulamiento("Juan", 5000.00, false);
        System.out.println("Encapsular Nombre: " + encapsular.getNombre());
        //encapsular.nombre = "Juan Andres";//No se puede acceder debido a que esta encapsulada
        encapsular.setNombre("Adriana");//Esta alternativa modifica el nombre
        System.out.println("Encapsular nombre modificado: " + encapsular.getNombre());
        System.out.println("Encapsular sueldo: " + encapsular.getSueldo());
        System.out.println("Encapsular estado eliminado: " + encapsular.isEliminado());
        encapsular.setEliminado(true);
        System.out.println("Encapsular estado eliminado modificado: " + encapsular.isEliminado());
    }
    
}
