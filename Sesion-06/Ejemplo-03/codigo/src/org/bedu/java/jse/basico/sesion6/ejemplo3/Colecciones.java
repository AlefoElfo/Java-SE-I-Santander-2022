package org.bedu.java.jse.basico.sesion6.ejemplo3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        /* List es una interfaz. 
        * <> Se les conoce como genéricos. Una lista donde todos los elementos van a ser cadenas
        * No podemos crear una clase List (porque es interfaz). Por eso se utiliza el ArrayList
        *   Un ArrayList es un tipo de herencia. Todos los métodos de List los tienen ArrayList
        *   EL método add agrega
        */

        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        /*
        l.get(0);
        l.get(1); pero si fueran muchos elementos, sería horrible
         * Puedo acceder a esos elementos por el método get
         * Mejor me apoyo de una estructura de repetición, dado que sabemso cuántos elementos tiene la estructura
        
        for (int i = 0; i < listaCadenas.size(); i++) {
        System.out.println(listaCadenas.get(i));
        }
         * .size nos indica cuántos elementos tiene la estructura. Así el código funciona sin tener que actualizar el número
         * Cuando creamos la lista no le especificamos cuántos elementos íbamos a tener. Las listas no tiene un tamaño fijo, a diferencia de los arreglos.
         * Podemos usar un for mejorado, "for each", (for tuneado)
         *  Para cada elemento de la lista:
        */

        for (String cadena : listaCadenas) {
            //System.out.println(cadena);
        }
        
        //System.out.println();


        // -------------------
        // sets o CONJUNTOS --
        // -------------------
        /*
         * Set también es una colección
         * HashSet<> es otra implementación. Una forma de identificar de manera única algo
         * Vienen de una jerarquía que se llama Collection, así que List y Set tienen métodos en común, pero no son internamente lo mismo
         * add es diferente con Set . Tiene un orden diferente. Tal vez sea por uso de memoria
        */

        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        for (String cadena : setCadenas) {
            //System.out.println(cadena);
        }

        //System.out.println();

        /*
         * Vamos a usar la clase Numero:
         * Para crear un número necesito la palabra new
         */
        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("cinco"));

        for (Numero numero : listaNumeros) {
            //System.out.println(numero.getNombre());
        }

        //System.out.println();
        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));

        for (Numero numero : setNumeros) {
            System.out.println(numero.getNombre());
        }
    }
}
