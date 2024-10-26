
package test;

import contextoestatico.ContextoEstatico;

/**
 *
 * @author Zaodri
 */
public class PersonaContextoStatic {
    
    public static void main(String[] args) {
        ContextoEstatico personStatic = new ContextoEstatico("Prueba");
        ContextoEstatico personStaticUno = new ContextoEstatico("Adriana");
        ContextoEstatico personStaticDos = new ContextoEstatico("Quedó");
        ContextoEstatico personStaticTres = new ContextoEstatico("Bien");
        
        imprimir(personStatic);
        imprimir(personStaticUno);
        imprimir(personStaticDos);
        imprimir(personStaticTres);
    }
    public static void imprimir(ContextoEstatico contextoEstatico){//el metodo llamada tsmbien debe ser de tipo static
        System.out.println("contextoEstatico = " + contextoEstatico);
    }
}
