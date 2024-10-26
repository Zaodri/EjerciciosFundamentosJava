/* Ejemplo de herencia desde el package domain con clase Persona, 
* la clase Empleado y la clase Cliente, 
*  y el package test con la clase TestHerencia
*/
package dominio;

/**
 *
 * @author Zaodri
 */
public class Empleado extends Persona{
    
    //Son de tipo  private por que no heredan a una clase hija
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    //constructor distinto para inicializar los atributos de la clase padre
    public Empleado(String nombreArg, double sueldoArg){
        //super(nombreArg);//Por ahora no lo uasmos porque llamaremos al contructor vacio usando this();
        //this.idEmpleado = ++ Empleado.contadorEmpleado;//Por ahora no lo uasmos porque llamaremos al contructor vacio
        this();
        this.nombre = nombreArg;
        this.sueldo = sueldoArg;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleadoSet) {
        this.idEmpleado = idEmpleadoSet;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldoSet) {
        this.sueldo = sueldoSet;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombreArg) {
        this.nombre = nombreArg;
    }    
    
    //Una forma de llamar el metodo .toString()
//    @Override
//    public String toString() {
//        return "Empleado{" + "idEmpleado = " + idEmpleado + ", sueldo = " + sueldo + '}';
//    }
    
    /*
    * Otra forma de llamar al metodo toString es con la clase StringBuilder, 
    * cambia la forma de conctenar cadenas pero es lo mismo
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado = ").append(idEmpleado);
        sb.append(", sueldo = ").append(sueldo);
//        sb.append(", nombre = ").append(nombre);//una forma de para acceder a a este atributo de la clase padre
        sb.append(", Persona ( ").append(super.toString()).append(")");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
