
package clases;

/**
 *
 * @author Zaodri
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona personaUno;//creando una variable
        personaUno = new Persona();//creando un objeto con la variable
        personaUno.nombre = "Adriana";//utilizando el objeto para traer uno de los atributos de la clase Persona
        personaUno.apellido = "Rico";//utilizando el mismo objeto para traer otro atributo de la clase Persona
        personaUno.desplegarInformacion();//utilizando el mismo objeto para traer un metodo de la clase Persona
    
        Persona personaDos = new Persona();
        personaDos.nombre = "Javier";
        personaDos.apellido = "Rodriguez";
        personaDos.desplegarInformacion();
        
        Persona aritmetica = new Persona();
        aritmetica.a = 2;
        aritmetica.b = 7;
        aritmetica.operaciones();
        aritmetica.operacionesConRetorno();
        aritmetica.opreacionConArgumentos(5, 8);
    }
    
}
