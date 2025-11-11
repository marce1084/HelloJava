package org.javafintech2025.JavaStandard_WebProgra.Modulo2.ClasesObjetos;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Random;

public class Persona {
    // Atributos de la clase Persona.
   private String nombre;
   private String apellido;
   private Documento documento;
   private byte edad;

    // Constructor por defecto.
    public Persona() { }

    // Constructor sin edad, solo con los datos públicos.
   public Persona(String nombre, String apellido, Documento documento) {
         this.nombre = nombre;
         this.apellido = apellido;
         this.documento = documento;
         this.edad = asignarEdad();
   }

    // Metodo para modularizar aun mas nuestra clase
    public boolean mayorEdad(){
        // recordemos que los operadores relacionales devuelven un valor booleano
        // y pueden asignarse directamente a una variable o retornar la respuesta en un metodo
        return edad >= 18;
    }

    // Mejoramos el metodo de la clase persona para hacerlo mas generico
    public String mostrarAtributos(){
        // utilizamos una variable para que sea mas entendible
        // el tipo de mensaje o estructura del mensaje es decision del desarrollador
        // aprovechamos mostrar atributos de la clase documento
        String mensaje = ("Nombre: " + nombre + ", Apellido: " + apellido + ", " + documento.mostrarAtributos() +
                        ", Edad: " + edad + " y es "
                        + (mayorEdad() ? "Mayor de Edad" : "Menor de Edad"));
        return mensaje;
    }

    // Metodo para asignar edad
    public byte asignarEdad(){
        // utilizamos la clase Random y hacemos un casting aunque no hemos visto bien
        // este tema lo que se hace es convertir el dato en tipo byte ya que entero es
        // mas grande
        Random nuevaEdad = new Random();
        return (byte) nuevaEdad.nextInt(127);
    }

    // Metodo de la clase Persona.
    /*void mostrarAtributos(){
        String mensaje = ("Nombre: " + nombre + ", Apellido: " + apellido + ", Tipo de Documento: " + TipoDocumento +
                        ", Numero de Documento: " + NumeroDocumento + ", Edad: " + edad + " y es "
                        + (edad >= 18 ? "Mayor de Edad" : "Menor de Edad"));
        System.out.println(mensaje);
   }*/

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public byte getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}