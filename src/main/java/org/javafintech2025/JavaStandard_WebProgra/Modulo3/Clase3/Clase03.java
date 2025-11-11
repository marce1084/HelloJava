package org.javafintech2025.JavaStandard_WebProgra.Modulo3.Clase3;

public class Clase03 {
    public static void main(String[] args) {

        // Domicilio domi = new Domicilio("Rivadavia", 648, "CABA");
        // Persona p = new Persona();

        //antes
        //p.nombre = "Juan";
       /* p.setNombre("Juan"); //seteo el nombre
        p.setApellido("Perez");
        p.setEdad(54);
        p.setDomicilio(domi);*/
        //Para acceder al nombre solo lo puedo hacer via metodo
        //getNombre() al atributo nombre

        /*System.out.println("Nombre: "+p.getNombre());

        //Despues de hacer el getter y setter en Domicilio puedo obtener la localidad.
        System.out.println("Domicilio: "+p.getDomicilio().getNro());

        // Atributos estaticos
        Persona juan = new Persona();
        Persona pedro = new Persona();
        System.out.println(juan.cantOrejas);
        System.out.println(pedro.cantOrejas);
        System.out.println(Persona.cantOrejas); //hago referencia al atributo directamente
        //sin instanciar un objeto.
        //cambio el valor de la variable estatica
        Persona.cantOrejas=3;
        System.out.println("Nuevo Valor: "+Persona.cantOrejas);
        System.out.println("Nuevo Valor Juan: "+juan.cantOrejas);*/

        /*Estudiante s1 = new Estudiante();
        s1.showData();
        Estudiante s2 = new Estudiante();
        s2.showData();

        AspiranteEstudiante aspirante1 = new AspiranteEstudiante();
        System.out.println("Aspirante 1 valor A: "+aspirante1.a);
        System.out.println("Aspirante 1 valor B: "+aspirante1.b);*/ //porque vale 3 b. Vale 3 porque el constructor fue invocado 3 veces.

        /*System.out.println();
        //creo un domicilio para Alumno 2.
        Domicilio domi2 = new Domicilio("Las Heras", 110, "RAMOS MEJIA");
        //Creo un alumno y le cargo un apellido, nombre, nro alumno, domicilio
        Alumno alum1 = new Alumno();
        alum1.setNumeroAlumno(1000);
        alum1.setNombre("Pedro");
        alum1.setDomicilio(domi2);

        //Muestro por consola la localidad, el nro de alumno y el nombre.
        System.out.println("Nro Alumno: "+alum1.getNumeroAlumno());
        System.out.println("Nombre Alumno: "+alum1.getNombre());
        System.out.println("Localidad Alumno: "+alum1.getDomicilio().getLocalidad());*/

    }

}