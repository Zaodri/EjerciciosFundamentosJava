
package contextoestatico;

/**
 *
 * @author Zaodri
 */
public class ContextoEstatico {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersona;
    
    public ContextoEstatico(String nombreArg){
        this.nombre = nombreArg;
        
        //Incrementar el contador por cada objeto nuevo
        ContextoEstatico.contadorPersona ++;
        
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = contadorPersona;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public void setIdPersona(int idPersonaArg){
        this.idPersona = idPersonaArg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreArg) {
        this.nombre = nombreArg;
    }

    @Override
    public String toString() {
        return "ContextoEstatico{" + "idPersona = " + idPersona + ", nombre = " + nombre + '}';
    }
    
}
