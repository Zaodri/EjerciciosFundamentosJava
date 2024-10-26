
package pasoporvalor;

/**
 *
 * @author Zaodri
 */
public class PasoPorValor {
    public static void main(String[] args) {
        System.out.println("Imprimiendo Paso de valores primitivo");
        System.out.println("*****************\n");
        //Paso de valores
        int jota = 10;
        System.out.println("jota = " + jota);
        //Lmanando al metodo cambioValor(int jotaUno)
        cambioValor(jota);
        System.out.println("*****************\n");
    }
    //Metodo para paso de mensajes con la variable de tipo entera jota = 10
    public static void cambioValor(int jotaUno){
        System.out.println("jotaUno = " + jotaUno);
    }
}
