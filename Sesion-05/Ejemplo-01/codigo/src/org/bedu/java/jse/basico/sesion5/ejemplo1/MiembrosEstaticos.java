package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont2 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont3 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont4 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        /*
         * Debería salir c1.contador Instancia: 1 y luego c4.contadorInstacia: 1, pero en la siguiete línea sale 4, esto es porque el contador es una variable static, o sea que puede cambiar
         */


//        System.out.println("cont1.contadorInstancia: " + cont1.getContadorInstancia());
//        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());
//        System.out.println();
//        System.out.println("cont4.contadorInstancia: " + cont4.getContadorInstancia());
//        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());
    }
}
