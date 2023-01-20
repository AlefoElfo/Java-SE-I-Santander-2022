package org.bedu.java.jse.basico.sesion3.reto1;

import java.util.Scanner;

public class VocalesAlef {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola. Contaré las vocales de lo que escribas a continuación: ");
        String palabra = scanner.nextLine(); // Leer input para el conteo
        
        // Conteo de vocales
        int totalVocales = 0; //cuenta de vocales
        //palabra.toLowerCase().toCharArray(); // Método para convertir en minúsculas y método para hacer un array con los caracteres. Parece que no hace fala porque lo puse dentro del ciclo for.
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                totalVocales++;
            }
        }

        // Programa final
        System.out.println("En «" + palabra + "» hay " + totalVocales + " vocales :)");
    }    
}
