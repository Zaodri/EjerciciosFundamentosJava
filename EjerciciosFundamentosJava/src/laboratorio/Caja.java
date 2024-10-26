
package laboratorio;

/**
 *
 * @author Zaodri
 */
public class Caja {
    
    //Debe contener 3 atributos de tipo entero
    int ancho, alto, profundo;
    
    //Debe contener 1 constructor vacio
    public Caja(){
        
    }
    
    //Debe contener 1 constructor No vacio
    public Caja(int anchoArg, int altoArg, int profundoArg){//constructor con argumentos
        ancho = anchoArg;
        alto = altoArg;
        profundo = profundoArg;
    }
    
    public void calcularVolumenCaja(){
        int vol = ancho * alto * profundo;
        System.out.println("El volumen de la caja es = " + vol);
    }

}
