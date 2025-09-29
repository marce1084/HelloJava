package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Clase2;

public class Persona {
    // Atributos de la clase Persona.
    String nombre;
    String apellido;
    int edad;
    Domicilio domicilio; // Agregamos un atributo de tipo Domicilio.

    // Creo el metodo que devuelve el nombre completo de la persona.
    public String dameTuNombreCompleto(){
        return nombre + ", " + apellido;
    }

    public Persona(){ // Constructor por defecto
    }


}
