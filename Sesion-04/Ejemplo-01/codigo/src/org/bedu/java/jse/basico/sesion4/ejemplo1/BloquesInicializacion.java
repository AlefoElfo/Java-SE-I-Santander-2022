package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class BloquesInicializacion {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(); // Creo un alumno sin atributos
        
        // No puedo poner alumno.curso, porque hice los atributos privados. Hay que usar el método getter
        /*
         * No quiero saber el curso como lo definí, sino como una clase
         */
        System.out.println("sesión: " + alumno.getSesion());
        System.out.println("curso: " + alumno.getCurso());
        System.out.println("objetivo " + alumno.getObjetivo());
    }
}
