package org.bedu.java.jse.basico.sesion7.ejemplo1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>(); //Darle más prioridad a algunos elementos que a otros

        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");

        /*
        for (String cadena : cola) {
            System.out.println(cadena);
        }
        */
        
        String valor = null;
        // Minetras sea distinta de null, imprime esa variable:
        while ((valor = cola.poll()) != null) {
            //System.out.println(valor);
        }
        // La prioridad que toma por default es el orden alfabético

        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("uno", 4));
        libros.add(new Libro("dos", 3));
        libros.add(new Libro("tres", 8));
        libros.add(new Libro("cuatro", 2));
        libros.add(new Libro("cinco", 9));
        libros.add(new Libro("seis", 5));
        libros.add(new Libro("siete", 7));
        libros.add(new Libro("ocho", 1));
        libros.add(new Libro("nueve", 6));
        libros.add(new Libro("diez", 10));

        Libro libro = null;

        while ((libro = libros.poll()) != null) {
            System.out.println(libro.getTitulo());
        }
    }
}
