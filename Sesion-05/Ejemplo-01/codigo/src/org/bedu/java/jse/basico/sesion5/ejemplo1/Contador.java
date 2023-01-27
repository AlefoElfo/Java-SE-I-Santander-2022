package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class Contador {
    // Atributos. Se inicializan con un valor por defecto (por eso no da error)
    private static short contadorClase;
    private short contadorInstancia;


    // Constructor. El contador por defecto es 0, al poner ++ se sube a 1. Los objetos se inicializan con null
    public Contador() {
        contadorClase++;
        contadorInstancia++;
    }


    // Métodos
    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
