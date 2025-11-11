package org.javafintech2025.JavaStandard_WebProgra.Modulo3.EjercicioExtra;

public class Auto {

    String color;
    int anio;
    static int cantidadAutosFabricados;

    // Constructor incrementa la cantidad de autos fabricados
    Auto(String color, int anio) {
        this.color = color;
        this.anio = anio;
        cantidadAutosFabricados ++;
    }

    // Metodo de instancia: muestra el color y el año del auto
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }

    // Metodo de clase (estatico)
    public static int CantidadAutosFabricados() {
        return cantidadAutosFabricados;
    }
}
