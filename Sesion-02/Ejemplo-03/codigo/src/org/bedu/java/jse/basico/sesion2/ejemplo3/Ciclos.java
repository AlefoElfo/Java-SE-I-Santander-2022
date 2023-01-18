package org.bedu.java.jse.basico.sesion2.ejemplo3;

public class Ciclos {
    public static void main(String[] args) {
        short valor = 2;
        short[] valores = {1,2,3,4,5,6,7,8,9,10}

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor arreglo: " + valores[i]);
        }

        // for-each
        for (short valor : valores) {
            System.out.println("El valor del arreglo es: " + valor);
        }

        // do-while. While invertido, garantia que se ejecuta al menos una vez
        short j = 1;
        do {
            System.out.println(j);
        } while (j++ < 10);

    }
    
}
