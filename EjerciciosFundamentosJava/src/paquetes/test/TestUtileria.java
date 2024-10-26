/*
*trabajando con importaciones de diferentes formas que imprimin lo mismo
*/
package paquetes.test;

import paquetes.mx.com.globalmentoring.*; //asterisco para llamar todas las clases que etan en todos los paquetes
//import paquetes.mx.com.globalmentoring.Utileria; // utilizando unicamente la clase Utileria
//import static paquetes.mx.com.globalmentoring.Utileria.imprimir;// al indicar que es estatico podemos utilizar ya sean los metodos o los atributos de la lcase
/**
 * @author Zaodri
 */
public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos");
        //imprimir("Adios"); // utilizamos el metodo estatico de la clase Utileria "se puede confundir un poco al creer que es un metodo de la clase TestUtileria"
        //paquetes.mx.com.globalmentoring.Utileria.imprimir("adios"); // se conoce como nombre completamente calificado
    }
}
