package org.javafintech2025.IntoJava_Modulo1;

/*
1. Resolver los enunciados desarrollando el código.
2. Dados n1=10, n2=20 y n3=30, informar:
a) El total.
b) El promedio.
c) El resto entre n2 y n1.
*/

public class Ejercicio7_Operadores {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;
        int total=n1+n2+n3;
        double promedio=(n1+n2+n3)/3;
        int resto=n2%n1;
        System.out.println("total= " + total);
        System.out.println("promedio= " + promedio);
        System.out.println("resto: " + resto);
    }
}
