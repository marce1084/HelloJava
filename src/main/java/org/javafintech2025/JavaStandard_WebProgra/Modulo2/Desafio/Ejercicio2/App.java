package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Desafio.Ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String[] documentos = { "DNI", "LC", "LE", "PAS", "CI" };
        final String mensajeDocumentos = "\n\t1-Documento Nacional de Identidad -DNI \n\t2-Libreta Cívica - LC \n\t3-Libreta de Enrolamiento - LE \n\t4-Pasaporte - PAS \n\t5-Cédula de Identidad -CI";
        int indiceTipoDocumento;
        String tipoDocumento;
        String numeroDocumento;
        String nombre;
        String apellido;
        int cantidadPersonas;
        boolean existePersona = false;
        Persona[] personas;

        // Pedimos la cantidad de personas a ingresar
        System.out.print("Ingrese la cantidad de personas a registrar: ");
        cantidadPersonas = teclado.nextInt();
        personas = new Persona[cantidadPersonas];

        // Ingresamos los datos de las personas
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona [" + (i + 1) + "]");
            System.out.print("Indique el nombre: ");
            nombre = teclado.next();
            System.out.print("Indique el apellido: ");
            apellido = teclado.next();

      /*      do {
                existePersona = false;
                System.out.println("Documentos de " + nombre + " " + apellido + ": " + mensajeDocumentos);
                System.out.print("Tipo: ");
                indiceTipoDocumento = teclado.nextInt() ;
                tipoDocumento = documentos[indiceTipoDocumento - 1];
                System.out.print("Numero: ");
            }*/
        }
    }
}
