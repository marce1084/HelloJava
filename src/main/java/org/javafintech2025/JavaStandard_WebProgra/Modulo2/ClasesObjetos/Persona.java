package org.javafintech2025.JavaStandard_WebProgra.Modulo2.ClasesObjetos;

public class Persona {
    // Atributos de la clase Persona.
    String nombre;
    String apellido;
    String TipoDocumento;
    Long NumeroDocumento;
    int edad;

    // Metodo de la clase Persona.
    void mostrarAtributos(){
        String mensaje = ("Nombre: " + nombre + ", Apellido: " + apellido + ", Tipo de Documento: " + TipoDocumento +
                        ", Numero de Documento: " + NumeroDocumento + ", Edad: " + edad + " y es "
                        + (edad >= 18 ? "Mayor de Edad" : "Menor de Edad"));
        System.out.println(mensaje);

}
}