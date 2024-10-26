/* Ejemplo de herencia desde el package domain con clase Persona, 
* la clase Empleado y la clase Cliente, 
*  y el package test con la clase TestHerencia
*/
package dominio;

import java.util.Date;

/**
 *
 * @author Zaodri
 */
public class Cliente extends Persona{

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int aContadorCliente) {
        contadorCliente = aContadorCliente;
    }
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(){
        
    }

    public Cliente(Date fechaRegistroArg, boolean vipArg, String nombre,
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);//se llama constructor de la clase padre
        this.idCliente = ++ Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistroArg;
        this.vip = vipArg;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());//clase padre
        sb.append('}');
        return sb.toString();
    }
   
    
    
}
