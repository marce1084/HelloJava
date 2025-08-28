package org.javafintech2025.IntoJava_Modulo1;

/*
Ejercicio 2: operadores aritméticos con asignación compacta
1. Analizar el código a continuación y completar la tabla correspondiente.
2. Luego, realizar la codificación para confirmar que la ha completado correctamente
*/

public class Ejercicio2_Operadores {
    public static void main(String[] args) {
        System.out.println('A');
        int x = 5;
        int y = 10;
        System.out.println(x);
        System.out.println(y);
        System.out.println('B');
        x +=y;
        y +=x;
        System.out.println(x);
        System.out.println(y);
        System.out.println('C');
        x-=y ;
        y-=x ;
        System.out.println(x);
        System.out.println(y);
        System.out.println('D');
        x*=y;
        y*=x;
        System.out.println(x);
        System.out.println(y);
        System.out.println('E');
        x/=y ;
        y/=y ;
        System.out.println(x);
        System.out.println(y);
    }
}
