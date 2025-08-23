package org.javafintech2025.Modulo1;
/*Ejercicio 1
Crear un programa en Java que, dado un número
entero de horas, muestre el equivalente en
semanas, días y horas*/

public class Ejercicio1_Operadores {
    public static void main(String[] args) {
        int horas_totales = 1500;
        int semanas = 0;
        int dias = 0;
        int horas = 0;
        int restoSemanas = 0;

        // calculamos las semanas
        semanas = horas_totales /  (24 * 7);

        //tomamos las horas que restan de la semana
        restoSemanas = horas_totales % (24 * 7);

        //calculamos los días
        dias = restoSemanas / 24;

        //calculamos las horas
        horas = restoSemanas % 24;

        System.out.println("Cantidad total de horas: " + horas_totales);
        System.out.println(semanas + " Semanas, " + dias + " Dias, " + horas + " Horas");
    }
}
