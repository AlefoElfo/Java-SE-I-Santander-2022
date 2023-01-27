package org.bedu.java.jse.basico.sesion5.ejemplo3;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;

    public Equipo(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    // Aunque se llaman igual, como tienen cosas diferentes, el compilador detecta que son dos constructores diferentes. Por eso no muestra error
    /*
     * Si queremos varios constructores, al menos que difieran en el tipo de datos.
     * El programa no tiene problemas con diferenciarlos porque a cada uno le asigna un id diferente
     * Antes no tenían este mecanismo, el polimorfismo. Es una especie de polimofismo. Antes tenía 20 métodos que usaban lo mismo pero con diferente tipo de dato (String, int, double), con el polimorfismo se resuelve.
     */
    public Equipo(String nombre, String ciudad) {
        this(nombre, ciudad, 0);
    }

    public Equipo(String ciudad) {
        this("Anónimos", ciudad);
    }


    // Métodos
    /*
     * No es constructor porque tiene "void"
     */
    public void actualiza(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void actualiza(String nombre){
        this.nombre = nombre;
    }

    public void actualiza(int puntos){
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }
}
