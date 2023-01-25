package org.bedu.java.jse.basico.sesion4.ejemplo2;

public class Ejemplo2 {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil auto2 = new Automovil("Bugatti", "Veyron Bleu Centenaire", 2009, 10000);
        Automovil auto3 = new Automovil("Ferrari", "335 Spider Scaglietti", 1957, 12000);
        
        // System.out.println(auto1.getMarca()); con el método getter
        /*
         * Los objetos tienen una jerarquía de clases, tiene que ver con la herencia.
         * Todas las clases de Java herdan de la clase más superior, la clase Object.
         * 
         * Método equals: ¿Cómo sabemos que los objetos Automovil son iguales o diferentes? Con el método equals
         * Método hashCode: Genera un identificador de objetos (id). Sirve mucho cuando se hacen conexiones con bases de datos, como llaves primarias
         */
        System.out.println("Auto 1, hash: " + auto1.hashCode());
        System.out.println("Auto 2, hash: " + auto2.hashCode());
        System.out.println("Auto 3, hash: " + auto3.hashCode());
    }
}
