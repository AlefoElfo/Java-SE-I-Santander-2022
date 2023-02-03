package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class BloquesInicializacionAlef {
    public static void main(String[] args) {
        // AlumnoAlef alef = new AlumnoAlef("Curso"; "Objetivo"; 4);
        // No se puede porque no se hizo constructor
        
        AlumnoAlef alef = new AlumnoAlef();

        System.out.println("Curso " + alef.getCursoAlef());
        System.out.println("Objetivo " + alef.getObjetivoAlef());
        System.out.println("Sesión " + alef.getSesionAlef());
        
    }
}
