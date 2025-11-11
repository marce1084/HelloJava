package org.javafintech2025.JavaStandard_WebProgra.Modulo3.Clase3;

public class Estudiante {
    int a; // inicializado a cero
    static int b; // inicializado a cero solo cuando la clase no está cargada para cada objeto creado.

    Estudiante() {
        // Constructor incrementa la variable estática b
        b++;
    }
    public void showData() {
        System.out.println("Valor de a =" + a);
        System.out.println("Valor de b =" + b);
    }
    // public void increment () {
    // a ++;
    //} }

}
