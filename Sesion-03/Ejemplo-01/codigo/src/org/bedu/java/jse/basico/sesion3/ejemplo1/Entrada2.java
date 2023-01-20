package org.bedu.java.jse.basico.sesion3.ejemplo1;

import java.util.Scanner;
import java.io.Console;
// No debería ser 'Librería', sino Biblioteca
// Cuando algo no está en el núcleo de Java, lo importo o lo creo


public class Entrada2 {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in); // Especifico el nombre de la clase, luego doy un nombre a la variable (que es una clase). Luego sigue new que especifica un nuevo objeto, luego se escribe el CONSTRUCTOR de la clase (es el mismo nombre de la clase)
        // Esto es un objeto ↑

        //String nombre = "Fulanito"; En vez de poner el nombre, usamos el objeto Scanner con su método. Se coloca el punto como notación, para pedirle un método
        System.out.println("Escribe tu nombre: "); // Para que sepa el usuario qué anotar.  Si no corremos esto, aparecerá una consola esperando una respuesta, pero sin especificar nada,
        String nombre = scanner.nextLine(); //Obtengo una cadena del teclado. Hay otros métodos next. nextLine sólo lee cadenas.Si ingresamos algo, no hace nada con esa información ingresada.
        System.out.println("Hola " + nombre); // Genera una respuesta con el nombre que ingresamos
        
        // Console
        Console console = System.console(); // Clase + nombre de la variable + = + constructor. Aquí utilizamos un método de otra clase

        // Si la consola existe, puedo usar sus métodos. Si no existe, no se puede crear el objeto de arriba ↑
        if (console == null) {
            System.out.println("No hay consola :(");
            System.exit(1); // 0 significa que todo bien, 1 significa que hay un error. Dará error porque los IDE no hay consolas (IntelliJ no, pero VS Code sí).
        }
        System.out.println("Escribe tu nombre");
        // String nombre = console.readLine();
        String nombre2 = console.readLine("%s"); // Con %s le digo que es string, hay otros especificadores de formato.
        System.out.println("Hola, " + nombre2);

        System.exit(0);
    }
    
}
