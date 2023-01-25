package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class Alumno {
    // Creamos ATRIBUTOS: Curso, objetivo, sesión
    private String curso; // es una clase a partir del tipo char, no es primitivo, por eso en minúscula
    private byte sesion; // es un dato primitivo, por eso va en minúscula (convención)
    private String objetivo;

    // Bloque de INICIALIZACIÓN
    /*
     * Antes no existían, había que hacer un constructor, pero ya es posible
     * Para un constructor habría que poner: public contructor () {}
     * Hay dos tipos de costructores, como bloque de inicialización, que no tiene
     * parámetro
     * Como costructor tal cual
     * Ahora pondremos, en este bloque, un contenido por default. No se puede poner
     * argumentos??
     */
    {
        curso = "Java Standard Edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    // Nuevo bloque de inicialización
    /*
     * El orden sí importa. Ejecuta el primer bloque con curso y luego, el segundo bloque sobreescribió el valor de curso.
     * Hay quienes recomiendan sólo poner un bloque de inicialización, porque es sólo inicio y porque sobreescribe.
     */

    {
        curso = "Java Standard Edition 2023";
    }

    // Ahola los MÉTODOS:
    // * Getter del curso:
    public String getCurso() {
        return curso;
    }

    // * Getter de la sesión
    public byte getSesion() {
        return sesion;
    }

    // * getter de objetivo
    public String getObjetivo() {
        return objetivo;
    }

}
