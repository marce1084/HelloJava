package org.javafintech2025.JavaStandard_WebProgra.Modulo3.Clase3;

public class Persona {

    // le coloco private a mis atributos
    // con esto nadie podra llamar a mis atributos
    // de manera directa
    private String nombre;
    private String apellido;
    private int edad;
    private Domicilio domicilio;
    public static int cantOrejas = 2; // atributo estatico de clase


    //coloco un metodo de acceso y un metodo
    //de seteo de datos
    //metodo publico para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
