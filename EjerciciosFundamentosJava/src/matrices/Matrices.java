/*
 * Una matriz es un arreglo de arreglos
 */
package matrices;

import dominio.Persona;

/**
 *
 * @author Zaodri
 */
public class Matrices {
    public static void main(String[] args) {
        
        //Matriz de tipo entero
        int edades [][] = new int [3][2];
        System.out.println("edades = " + edades); // imprime direccion de memoria del arreglo
        
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 8;
        edades [1][1] = 4;
        
        System.out.println("edades [0][0] = " + edades [0][0]);
        System.out.println("edades [0][1] = " + edades [0][1]);
        System.out.println("edades [1][0] = " + edades [1][0]);
        System.out.println("edades [1][1] = " + edades [1][1]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);
                
            }//fin for anidado           
        }//fin for
        
        //Mtriz de tipo String
        String frutas [][] = {{"Peras", "manzanas"},{"Mangos", "arandanos"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("Frutas = " +ren + "-" + col + ": " + frutas[ren][col]);
                
            } //fin for anidado           
        }//fin for
        
        
        //matriz de objetos
        
        Persona personas[][]= new Persona[2][2];
        personas[0][0] = new Persona("Dombledore");
        personas[0][1] = new Persona("Javi");
        personas[1][0] = new Persona("Tomas");
        personas[1][1] = new Persona("Alejandro");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz = " +ren + "-" + col + ": " + matriz[ren][col]);
            } //fin for anidado           
        }//fin for
    }
}
