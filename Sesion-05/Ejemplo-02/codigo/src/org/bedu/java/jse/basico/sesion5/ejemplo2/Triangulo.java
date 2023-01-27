package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class Triangulo extends FiguraPlana {
    // atributos
    private final String estilo;

    // Constructor
    public Triangulo(double base, double altura, String estilo) {
        super(base, altura); // Para no volver a inicializar, la palabra reservada refiere al constructor de la clase padre
        this.estilo = estilo; // estilo no es parte de la súperclase, así que hay que inicializarlo
    }

    // Métodos
    public double area() {
        return getBase() * getAltura() / 2;
    }

    public void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);
    }
}