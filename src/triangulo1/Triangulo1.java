
package triangulo1;

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