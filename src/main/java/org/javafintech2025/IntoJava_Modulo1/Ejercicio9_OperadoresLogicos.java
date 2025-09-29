package org.javafintech2025.IntoJava_Modulo1;

/*
Ejercicio 4
1. Resolver los enunciados desarrollando el código.
2. Dados n1=true, n2=false y n3=true, informar:
a) n1 ^ n2
b) (n1 & !n2) | n3
c) (n1 | n2) & !n3
*/

public class Ejercicio9_OperadoresLogicos {
    public static void main(String[] args) {
        boolean n1=true, n2=false, n3=true;

        System.out.println("a) " + (n1 ^ n2));
        System.out.println("b) " + ((n1 & !n2) | n3));
        System.out.println("c) " + ((n1 | n2) & !n3));
    }
}

