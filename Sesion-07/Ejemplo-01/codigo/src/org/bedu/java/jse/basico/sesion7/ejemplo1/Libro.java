package org.bedu.java.jse.basico.sesion7.ejemplo1;

public class Libro implements Comparable<Libro> {
    private final String titulo;
    private int prioridad;

    public Libro(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    // Reescribir la prioridad
    @Override
    public int compareTo(Libro libro) {
        return this.prioridad - libro.prioridad;
    }
}
