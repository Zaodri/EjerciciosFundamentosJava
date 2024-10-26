
package clases;

/**
 *
 * @author Zaodri
 */
public class Persona {
    //Atributos de tipo publico para clase PasoPorReferencia
    public String nombreObje;
    public String apellidoObje;
    //Atributos
    String nombre;
    String apellido;
    
    int a;
    int b;
    
    //Constructor de la clase
    public Persona(){
        
    }
    //metodos 
    public void desplegarInformacion(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
    }
    
    public void operaciones(){
        int result = a + b;
        System.out.println("result = " + result);
    }
    
    public int operacionesConRetorno(){
        int result = a * b;
        System.out.println("result = " + result);
        return result;
    }
    
    public int opreacionConArgumentos(int argUno, int argDos){
        a = argUno;
        b = argDos;
        System.out.println("argDos = " + (argDos + argUno));
        return a + b;
    }
}
