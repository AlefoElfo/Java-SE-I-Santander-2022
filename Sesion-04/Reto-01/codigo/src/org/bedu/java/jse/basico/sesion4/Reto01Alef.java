package org.bedu.java.jse.basico.sesion4;

public class Reto01Alef {
    public static void main(String[] args) {
        // Crear atributos del rectangulo
        RectanguloAlef r1Alef = new RectanguloAlef();
        RectanguloAlef r2Alef = new RectanguloAlef(3);
        RectanguloAlef r3Alef = new RectanguloAlef(3, 2);

        System.out.println("Área rectángulo 1: " + r1Alef.areaAlef());
        System.out.println("Área rectángulo 2: " + r2Alef.areaAlef());
        System.out.println("Área rectángulo 3: " + r3Alef.areaAlef());
    }
}
