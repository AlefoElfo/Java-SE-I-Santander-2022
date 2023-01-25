package org.bedu.java.jse.basico.sesion4.ejemplo2;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion; // EVitar caracteres especiales
    private int kilometraje;

    /*
     * COSTRUCTORES:
     *  Siempre son públicos
     * Si no pongo un constructor (o un bloque de inicailización), el método getter mostrará un null, los valores por defecto en Java (0, null, false)
     */

    // Crear constructor con valores asignados
    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        // A la izquierda es this y a la derecha es el atributo
        // this ("este") dice lo que algo es
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    // ANOTACIONES: Para que sobrescriba el siguiente código, ignora el default
    /*
     * Con esto se va a crear un hashCode personalizado
     */
    public int hashCode() {
        int hash = 0;
        hash = marca.hashCode();
        hash = hash + modelo.hashCode();
        hash = hash + anioFabricacion;
        hash = hash + kilometraje;
        return hash;
    }
}
