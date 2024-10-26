/* Ejemplo de herencia desde el package domain con clase Persona, 
* la clase Empleado y la clase Cliente, 
*  y el package test con la clase TestHerencia
*/
package dominio;

/**
 *
 * @author Zaodri
 */
public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio
    public Persona() {
    }

    //Constructor con un argumento
    public Persona(String nombreArg) {
        this.nombre = nombreArg;
    }

    //Constructor con varios argumentos
     public Persona(String nombreArg, char generoArg, int edadArg, String direccionArg) {
        this.nombre = nombreArg;
        this.genero = generoArg;
        this.edad = edadArg;
        this.direccion = direccionArg;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombreSet) {
        this.nombre = nombreSet;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char generoSet) {
        this.genero = generoSet;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edadSet) {
        this.edad = edadSet;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccionSet) {
        this.direccion = direccionSet;
    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " + direccion + '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad); 
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
