/*
 * 
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Zaodri
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        
        // Ejercicio 1: Imprimir por consola hola mundo        
        System.out.println("Hola Mundo");
        System.out.println("*****************\n");
        
        
        //concatenacion de variables
        String usuario = "Adriana";
        String titulo = "Ingeniera informatica";        
        String union =  titulo + " " + usuario;
        System.out.println(union);
        System.out.println("*****************\n");
        
        //concatenando tipos de datos
        int i = 7;
        int j = 2;        
        int result = i + j;
        System.out.println("Concatenacion i + j = " + i + j);
        System.out.println(usuario + " " + j + i );
        System.out.println(i + j + " " + usuario);
        System.out.println(usuario + " " + (i + j));
        System.out.println("result = " + result);
        System.out.println("*****************\n");
        
        //Caracteres especiales
        var nombre = "Adriana";        
        System.out.println("Salto linea: \n" + nombre);//Salto de linea
        System.out.println("Tabulador: \t" + nombre);//Tabulador
        System.out.println("retrocede una posicion o espacio: \b" + nombre);//retrocede una posicion o espacio
        System.out.println("retrocede 2 posiciones incluyendo los 2 puntos: \b\b" + nombre);//retrocede 2 posiciones incluyendo los 2 puntos
        System.out.println("quedaria el nombre entre las comillas simples: \'" + nombre + "\'");// quedaria el nombre entre las comillas simples abre\'  cierra\' esto con el fin de que el pregrama entienda que dentro de las comillas de la cadena van comollas internas que se inprimiran el consola
        System.out.println("quedaria el nombre entre las comillas dobles : \"" + nombre + "\"");//quedaria el nombre entre las comillas dobles abre\"  cierra\"
        System.out.println("*****************\n");
//        
//        //Clase Scanner
//        var apellido = "Rico";
//        System.out.println("Clase Scanner");
//        System.out.println("Escribe el nombre: ");
//        Scanner objetoEnConsola = new Scanner(System.in );
//        usuario = objetoEnConsola.nextLine();
//        System.out.println("usuario = " + usuario + " " + apellido);
//        //System.out.println("Escribe titulo: ");
//        //titulo = objetoEnConsola.nextLine();
//        System.out.println( "eres: " + titulo);
//        System.out.println("*****************\n");
//                               
        // Ejercicio 2: Tipos primitivos de enteros: byte, short, int, long
        System.out.println("Tipos primitivos\n");
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("*****************\n");
        
        short numeroShort = 10;
        System.out.println("Valor short: " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("*****************\n");
        
        int numeroInt = 10;
        System.out.println("Valor int: " + numeroShort);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("*****************\n");
        
        long numeroLong = 10; // 9223372036854775807L al imprimirlo asi se pierden digitos "o perdida de presicion, agregarle tipo de dato para que convierta el valor al mismo 
        System.out.println("Valor long: " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println("*****************\n");
        
        // Ejercicio 3: tipos primitivos de tipo flotante: float = 32 bytes y double = 64 bytes
        float numeroFloat = 10.0F; // literal de tipo flotante, agregandole la F mayuscula
        float numeroFloatF = (float) 10.0; // asi le indicamos al compilador que lo convierta de tipo float
        System.out.println("Valor float con literal: " + numeroFloat);
        System.out.println("Valor float compilando convertido a tipo float: " + numeroFloatF);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println("*****************\n");
        
        double numeroDouble = 10;
        double numeroDoubleD = (double)10;                
        System.out.println("Valor double con literal: " + numeroDouble);
        System.out.println("Valor double compilando convertido a tipo double: " + numeroDoubleD);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        System.out.println("*****************\n");
        
        //Uso de la palabra reservada var
        System.out.println("Uso de la palabra reservada var");
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numDouble = 15.0F;// con la F quedo de tipo float
        System.out.println("numDouble = " + numDouble);
        System.out.println("*****************\n");
        
        //Tipo primitivo char
        System.out.println("Tipo primitivo char");
        char miCaracter = 1;//con el num 1 imprime un cuadradito
        System.out.println("miCaracter = " + miCaracter);
        char mi_Caracter = 'a';
        System.out.println("mi_Caracter = " + mi_Caracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        int varCharEnteraSimbolo = '!';// imprime el decimal del caracter ver tabla unicode llamada list unicode, ver  Basic Latin
        System.out.println("varCharEnteraSimbolo ! = " + varCharEnteraSimbolo);
        
        int letra = 'a';// imprime el decimal del caracter ver tabla unicode llamada list unicode, ver  Basic Latin
        System.out.println("Valor decimal de la letra a = " + letra);
        System.out.println("*****************\n");
        
        // Convertir tipos primiticos
        System.out.println("Convirtiendo tipos primitivos");
        System.out.println("Ejemplo pollo 1: convertir tipo String a tipo int");
        //String edad_ = Integer.parseInt("20");
        String edad_s = "20";
        int edad = Integer.parseInt(edad_s);//utilizando var, con String arroja error
        System.out.println("edad = " + (edad + 1));
        
        System.out.println("Ejemplo 2: convertir tipo int a tipo String");
        int edadI = 20;
        String edad_I = String.valueOf(edadI);
        System.out.println("edad: " + (edad_I + 1));
        
        //Pedir un valor al usuario
//        System.out.println("Ejemplo Pedir un valor al usuario");
//        var consola = new Scanner(System.in);
//        System.out.println("Ingrese edad ");
//        edadI = Integer.parseInt(consola.nextLine());//Integer.parseInt(consola.nextLine()) Este metodo convierte en entero una cadena de texto
//        System.out.println("edadI = " + edadI);
//        System.out.println("*****************\n");

        //Convirtiendo int a String
        int edadTexto = 10;
        String edadText = String.valueOf(edadTexto);
        System.out.println("edadText = " + edadText);
        System.out.println("*****************\n");
        
        //Como recuperar un caracter de una cadena de texto
        System.out.println("recuperar un caracter de una cadena de texto");
        System.out.println("Cadena de texto 'hola'");   
                
        var caracterIndiceCero = "hola".charAt(0);
        System.out.println("caracterIndiceCero = " + caracterIndiceCero);
        
        var caracterIndiceUno = "hola".charAt(1);
        System.out.println("caracterIndiceUno = " + caracterIndiceUno);
        
        var caracterIndiceDos = "hola".charAt(2);
        System.out.println("caracterIndiceDos = " + caracterIndiceDos);
        
        char caracterIndiceTres = "hola".charAt(3);//con var o con char se puede hacer el ejemplo
        System.out.println("caracterIndiceTres = " + caracterIndiceTres);
        System.out.println("*****************\n");
        
        //ejemplo solicitando al usuario ingresar cadena
//        System.out.println("Ejemplo solicitando al usuario ingresar cadena");
//        var consola = new Scanner(System.in);
//        System.out.println("Ingrese cadena de texto ");
//        caracterIndiceTres = consola.nextLine().charAt(3);
//        System.out.println("Posicion de caracter " + caracterIndiceTres);
//        System.out.println("*****************\n");
        
        //Operadores aritmeticos
        System.out.println("Operadores aritmeticos");
        System.out.println("Operaciones entre 3 y 2");
        int a = 3, b = 2;
        int resultadoC = a + b;
        System.out.println("resultadoC = " + "suma "+ resultadoC);
        
        int c = 3, d = 2;
        int resultadoU = c - d;
        System.out.println("resultadoU = " + "Resta "+ resultadoU);
        
        int e = 3, f = 2;
        int resultadoD = e * f;
        System.out.println("resultadoD = " + "Multiplicacion "+ resultadoD);
        
        int g = 3, h = 2;
        int resultadoT = g / h;
        System.out.println("resultadoT = " + "Division "+ resultadoT);
        
        resultadoT = g % h;
        System.out.println("resultadoT = " + "Modulo de la Division "+ resultadoT);
        System.out.println("*****************\n");
        
        
        //Opreradores de asignacion
        System.out.println("Opreradores de asignacion");
        int a_a = 3, b_b = 2, c_c = a_a + 5 - b_b;
        System.out.println("c_c = a_a + 5 - b_b = " + c_c);
        
        a_a += 1; //a_a = a_a + 1
        System.out.println("a_a += 1 = " + a_a);
        
        a_a += 3; //a_a es ahora 4 por lo tanto a_a = a_a + 3 quedando 7
        System.out.println("a_a += 3 = " + a_a);
        
        a_a -= 1; //a_a = a_a - 1
        System.out.println("a_a -= 1 = " + a_a);
        
        a_a -= 3; //a_a = a_a - 3
        System.out.println("a_a -= 3 = " + a_a);
        
        a_a *= 1; //a_a = a_a * 1
        System.out.println("a_a *= 1 = " + a_a);
        
        a_a *= 3; //a_a = a_a * 3
        System.out.println("a_a *= 3 = " + a_a);
        System.out.println("*****************\n");
        
        //Operadores unarios
        System.out.println("Operadores unarios");
        System.out.println("*****************\n");
        
       //Paso de valores
        System.out.println("Imprimiendo Paso de valores");
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
