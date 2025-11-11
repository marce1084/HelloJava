package org.javafintech2025.JavaStandard_WebProgra.Modulo3.EjercicioExtra;

public class MainFabrica {
    public static void main(String[] args) {

        // Creo 3 autos con su color y año distinto
        Auto a1 = new Auto("verde", 2003);
        Auto a2 = new Auto("azul", 2022);
        Auto a3 = new Auto("rojo",2010);

        // Mostrar la información de cada auto con el metodo de instancia.
        System.out.println("=== Información de Autos ===");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();

        // Llamar al metodo de clase para mostrar cuantos autos se fabricaron en total sin crear un objeto nuevo.
        System.out.println("Total de autos fabricados: " + Auto.CantidadAutosFabricados());
    }
}
