package org.javafintech2025.IntoJava_Modulo1;

/*
Ejercicio 3: operadores aritméticos con asignación múltiple (suma y resta)
1. Analizar el código a continuación y completar la tabla correspondiente.
2. A continuación, realizar la codificación para confirmar que la ha completado correctamente.
*/

public class Ejercicio3_Operadores {
    public static void main(String[] args) {
        System.out.println('A');
        int x = 5;
        int y=10;
        int suma=0;
        int resta=0;
        System.out.println(x);
        System.out.println(y);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println('B');
        suma=x+y;
        resta=x-y;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println('C');
        suma=x+x;
        resta=y-y;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println('D');
        suma=x+y+x;
        resta=x-x-20;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println('E');
        suma=y+x+x;
        resta=-x-y-y;
        System.out.println(suma);
        System.out.println(resta);
    }
}
