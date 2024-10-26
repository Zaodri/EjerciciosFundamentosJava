     
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author Zaodri
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        System.out.println("Imprimiendo Paso de valores por referencia");//por referencia quiere decir de tipo objeto
        System.out.println("*****************\n");
        Persona personaUno = new Persona();
        personaUno.nombreObje = "Rocio"; 
        personaUno.apellidoObje = "Rocha";
        System.out.println("Nombre: " + personaUno.nombreObje);
        System.out.println("Apellido: " + personaUno.apellidoObje);
        cambiarValor(personaUno);
        System.out.println("Cambio de nombre = " + personaUno.nombreObje);
        System.out.println("Cambio de apellido = " + personaUno.apellidoObje);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombreObje = "Alejandro";
        persona.apellidoObje = "Rodriguez";
    }
    
}
