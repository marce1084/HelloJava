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
           // Persona personaAux = new Persona();

            System.out.println("Ingrese el nombre de la persona [" + (i + 1) + "]: ");
            String nombre = teclado.next();

            System.out.println("Ingrese el apellido de la persona [" + (i + 1) + "]: ");
            String apellido = teclado.next();

            System.out.println("Ingrese el tipo de documento de la persona [" + (i + 1) + "]: ");
            String TipoDocumento = teclado.next();

            System.out.println("Ingrese el numero de documento de la persona [" + (i + 1) + "]: ");
            String NumeroDocumento = teclado.next();

            // Creamos un Documento temporar y por constructor le mandamos los datos
            Documento documento = new Documento(TipoDocumento, NumeroDocumento);
            // creamos un objeto persona auxiliar para asignar a la posicion del vector
            // correspondiente
            // vemos la venta de utilizar variables auxiliares con el mismo nombre de los
            // parametros
            Persona personaAuxiliar = new Persona(nombre, apellido, documento);

            // tambien podemos omitir el objeto documento y mandarlo instanciando
            // directamente al constructor de persona
            // Persona personaAuxiliar = new Persona(nombre, apellido, new
            // Documento(tipoDocumento, numeroDocumento), edad);
            // asignamos el objeto auxiliar a la posicion del vector correspondiente
            personas[i] = personaAuxiliar;
            System.out.println();
        }
        // mostramos un salto de linea para diferenciar el titulo
        System.out.print("\n");

        // mostramos las notas, en este metodo uso el .length y no la variable cantidad
        // solo a modo de ejemplo
        System.out.println("------------------ Listado de Personas ------------------");
        for (int i = 0; i < personas.length; i++) {
            // mostramos los datos de la persona
            // al cambiar el metodo a uno con retorno lo podemos utilizar en donde
            // necesitemos y no nos vamos limitados a solo imprimirlo en consola
            System.out.println(personas[i].mostrarAtributos());

    }
        // cerramos el Scanner
        // debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
        // veremos más adelante el porqué de esto :)
        teclado.close();
}
}