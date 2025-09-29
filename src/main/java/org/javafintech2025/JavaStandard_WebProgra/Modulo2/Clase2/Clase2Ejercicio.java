package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Clase2;

public class Clase2Ejercicio {
    public static void main(String[] args) {

        //referencia  =   creacion y reserva
        //de persona    en memoria del objeto
        // p apunta a este lugar en memoria.
        Persona p = new Persona(); // new reserva espacio en memoria para un objeto de tipo persona.
        // p. muestra los métodos de la clase object. Son los métodos que JAVA guarda para los objetos.
        p.apellido = "Perez";
        p.nombre = "Juan";
        p.edad = 30;

        //Creo un objeto domicilio
        Domicilio domicilio = new Domicilio();
        // Asigno el domicilio a la persona
        domicilio.calle = "Lavalle";
        domicilio.numero = 678;

        p.domicilio = domicilio; // Asigno el domicilio a la persona, ahora p tiene un domicilio. Link entre ambos objetos.

        // Invocacion del metodo (desde el main).
        System.out.println(p.dameTuNombreCompleto());

    }
}
