package org.bedu.java.jse.basico.sesion4;

public class RectanguloAlef {
    private double altoAlef;
    private double anchoAlef;
    
    // Sobrecarga!
    public RectanguloAlef (double altoAlef, double anchoAlef) {
        this.altoAlef = altoAlef;
        this.anchoAlef = anchoAlef;
    }
    public RectanguloAlef(double lados) {
        this(lados, lados);
    }

    public RectanguloAlef() {
        this(0);
    }
    
    public double areaAlef() {
        return altoAlef * anchoAlef;
    }
}