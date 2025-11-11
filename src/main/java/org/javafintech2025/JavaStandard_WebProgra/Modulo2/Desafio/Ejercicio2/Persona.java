package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Desafio.Ejercicio2;

public class Persona {
    private Documento documento;
    private  String nombre;
    private  String apellido;

    public Persona(){

    }

    public Persona(Documento documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
