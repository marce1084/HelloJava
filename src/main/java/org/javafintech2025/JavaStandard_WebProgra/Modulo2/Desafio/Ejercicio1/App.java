package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Desafio.Ejercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Declaramos las variables y objetos
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        String[] simbolos = { "*", ".", "-", "_" };
        final String dominioValido = "@educacionit.com";
        String correo;
        String clave;

        do {
            // pedimos el correo
            System.out.print("Ingrese el correo electrónico del instituto: ");
            correo = teclado.next().toLowerCase();
            if (correo.length() > dominioValido.length() && correo.endsWith(dominioValido)) {
                break;
            }
            System.out.println("Debe ser un correo valido y recuerde que el dominio debe ser de " + dominioValido);
        } while (true);
        do {
            // pedimos la clave
            System.out.println("Ingrese la clave: ");
            clave = teclado.next();

            String primeraLetra = clave.substring(0, 1);
            boolean iniciaMayuscula = primeraLetra.toUpperCase().equals(primeraLetra);
            boolean contieneSimbolo = false;

            for (int i = 0; i < simbolos.length; i++) {
                // Verificamos si la clave contiene al menos uno de los símbolos
                if (clave.contains(simbolos[i])) {
                    contieneSimbolo = true;
                    break;
                }
            }
            if (iniciaMayuscula && contieneSimbolo) {
                break;
            }
            System.out.println("La clave debe iniciar con mayúscula y contener al menos un símbolo: *, ., - , _");
        } while (true);
        usuario.setCorreo(correo);
        usuario.setClave(clave);
        System.out.println(usuario.getDatos());

        teclado.close();
    }

}
