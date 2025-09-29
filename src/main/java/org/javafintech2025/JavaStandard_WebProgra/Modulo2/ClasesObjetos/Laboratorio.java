package org.javafintech2025.JavaStandard_WebProgra.Modulo2.ClasesObjetos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Laboratorio {
    public static void main(String[] args) {

        // Utilizamos la clase Scanner para pedir los datos desde la consola.
        Scanner teclado = new Scanner(System.in);

        // Declaramos las variables, sin inicializarlas pq no sabemos el tamaño.
        Persona[] personas;
        int cantPersonas;

        // mostramos por pantalla
        System.out.println("Ingreso de Datos de Personas Laboratorio 1");

        // Mostramos un salto de línea.
        System.out.println("\n");

        // Preguntamos al usuario la cantidad de personas a registrar.
        System.out.println("Ingrese la cantidad de personas a registrar: ");

        // capturamos lo que el usuario ingresa y lo asignamos como tamaño del
        // vector, recuerden Int para capturar es un entero y saber cantidad de personas
        cantPersonas = teclado.nextInt();
        personas = new Persona[cantPersonas];

        // usamos un for para preguntar cada uno de los datos de las personas
        for (int i = 0; i < personas.length; i++) {
            // preguntamos los datos de las personas y podemos usar un objeto auxiliar
            Persona personaAux = new Persona();

            System.out.println("Ingrese el nombre de la persona [" + (i + 1) + "]: ");
            personaAux.nombre = teclado.next();

            System.out.println("Ingrese el apellido de la persona [" + (i + 1) + "]: ");
            personaAux.apellido = teclado.next();

            System.out.println("Ingrese el tipo de documento de la persona [" + (i + 1) + "]: ");
            personaAux.TipoDocumento = teclado.next();

            System.out.println("Ingrese el numero de documento de la persona [" + (i + 1) + "]: ");
            personaAux.NumeroDocumento = teclado.nextLong();

            System.out.println("Ingrese la edad de la persona [" + (i + 1) + "]: ");
            personaAux.edad = teclado.nextInt();

            // asignamos el objeto auxiliar al vector en la posicion i
            personas[i] = personaAux;
            System.out.println();
        }
        // mostramos un salto de linea para diferenciar el titulo
        System.out.print("\n");

        // mostramos las notas, en este metodo uso el .length y no la variable cantidad
        // solo a modo de ejemplo
        System.out.println("------------------ Listado de Personas ------------------");
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Persona [" + (i + 1) + "]: ");
            // mostramos los datos de la persona
            personas[i].mostrarAtributos();

    }
        // cerramos el Scanner
        // debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
        // veremos más adelante el porqué de esto :)
        teclado.close();
}
}