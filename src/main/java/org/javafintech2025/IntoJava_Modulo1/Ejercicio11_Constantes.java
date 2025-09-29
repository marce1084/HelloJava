package org.javafintech2025.IntoJava_Modulo1;

/*
Ejercicio 6: uso de constantes
1. Haciendo uso de la constante IVA=21, calcular
el precio con IVA de los siguientes productos e informar:
    a) remera:59.90$
    b) pantalón:99.90$
    c) campera:149.90$
*/

public class Ejercicio11_Constantes {
    public static void main(String[] args) {
        final double IVA=21;
        double precio_remera=59.90;
        double precio_pantalon=99.90;
        double precio_campera=149.90;

        System.out.printf("Precio remera con IVA: '%.2f'" + (precio_remera+((precio_remera*IVA)/100)) );
        System.out.println("Precio pantalon con IVA: " + (precio_pantalon+((precio_pantalon*IVA)/100)) );
        System.out.println("Precio campera con IVA: " + (precio_campera+((precio_campera*IVA)/100)) );
    }
}
