package org.javafintech2025.JavaStandard_WebProgra.Modulo2;

/*Ej2:
Imprimir los valores 1000 2000 3000 pasados como argumentos del programa principal.
(Properties del Project, agregamos los argumentos en “Run”).*/

public class Ejercicio2 {
    public static void main(String[] args) {

        /*Cómo pasar argumentos (IDE tipo IntelliJ IDEA):
        Abre la clase Ejercicio2.
        Haz clic derecho > Run 'Ejercicio2.main()' una vez (esto crea la configuración).
        Arriba a la derecha (Run/Debug Configurations) edítala.
                En el campo Program arguments escribe:
        1000 2000 3000
        Acepta y vuelve a ejecutar.*/

        System.out.println("Los argumentos pasados son:");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
