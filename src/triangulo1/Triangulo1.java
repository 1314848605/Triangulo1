
package triangulo1;
//Hecho: Nelson Zambrano
/*
Realice un ejercicio con programación orientada a Objetos
que imprima en una matriz de MxM los siguientes triángulos segun corresponda.
A)
*
* *
* * *
* * * *
* * * * *
B)
*  *  *  *  *
*  *  *  *
*  *  *
*  *
*

*/

import java.util.Scanner;

public class Triangulo1 {
    public static void main(String[] args) {

        int nmatriz = 0;
        char caracter;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        nmatriz = miScanner.nextInt();
        
        System.out.println("Ingrese el caracter o signo a imprimir");
        caracter = miScanner.next().charAt(0);

        TrianguloA trianguloA = new TrianguloA(nmatriz, caracter);
        trianguloA.imprimir();

        System.out.println();

        TrianguloB trianguloB = new TrianguloB(nmatriz, caracter);
        trianguloB.imprimir();
    }
}
// DESCRIPCIÓN DE COSTES DE ESTIMACIÓN DE COSTES DEL PROYECTO:
//T(proyecto) = T(Imprimir Triangulo A) + T(Imprimir Triangulo B)
//T(proyecto) = [ta + tamaño*(2tc+3ta+2to) + 2tc] + [ta + tamaño*(2tc+3ta+2to) + 2tc ]
//T(proyecto) = 2ta + tamaño*(4tc+6ta+4to) + 4tc 
