
package palabrathis;

/**
 *
 * @author Zaodri
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Dombledore", "Rodríguez");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre " + persona.nombre);
        System.out.println("Persona apellido " + persona.apellido);
    }
}    
    class Persona{
        String nombre;
        String apellido;
        
        Persona(String nombre, String apellido){
            //super(); llamada al constructor de la clase Padre (object)
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("Objeto persona usando this " + this);
            new Imprimir().imprimir(this);
        }
    }

    class Imprimir{
        
        public Imprimir(){
            super();//El contructor de la clase object (padre) para reservar memoria  
        }        
        public void imprimir(Persona persona){
            System.out.println("persona desde imprimir = " + persona);
            System.out.println("Impresion del objeto actual this = " + this);//¿Qué imprime this? el objeto Persona o el objeto Imprimir? se imprime el objeto Imprimir ya que se encuentra dentro de la clase imprimir
        }
    }

