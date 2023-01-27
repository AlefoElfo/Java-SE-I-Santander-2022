package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class FiguraPlana {
    // Atributos
    /*
     * modificador final. Una vez delimitados, no quiero que nadie lo modifique
     * Si son final, necesito una forma de inicializar estos atributos
     */
    private final double base;
    private final double altura;

    // Constructor
    /*
     * Con ese método inicializamos los atributos. Ya sea con constructo o con método
     */
    public FiguraPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    void mostrarDimension() {
        System.out.println("La base y altura es: " + base + " y " + altura);
    }

    // Métodos
    //  getter
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }    
}
