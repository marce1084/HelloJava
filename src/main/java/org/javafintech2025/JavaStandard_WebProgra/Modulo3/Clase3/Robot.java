package org.javafintech2025.JavaStandard_WebProgra.Modulo3.Clase3;

public class Robot {
    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot);
    }
    @Override //@Override no se debe utilizar cuando no esta sobreescribiendo
    //  un metodo de la clase padre. No es obligatorio que este.
    //aunque si es recomendable.
    public String toString(){
        return "Hola, soy un robot";
    }
}
