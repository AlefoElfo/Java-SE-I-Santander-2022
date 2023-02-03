package org.bedu.java.jse.basico.sesion4.reto2;

public class LlantaAlef {
    private float anchoAlef;
    private float diametroAlef;
    private float presionAlef;
    public LlantaAlef(float anchoAlef, float diametroAlef, float presionAlef) {
        this.anchoAlef = anchoAlef;
        this.diametroAlef = diametroAlef;
        this.presionAlef = presionAlef;
    }

    // Rodar
    // public ruedaAlef () {
    //     System.out.println("Rodando ando :)");
    // }

    //setter y getter
    
    public float getAnchoAlef() {
        return anchoAlef;
    }
    public void setAnchoAlef(float anchoAlef) {
        this.anchoAlef = anchoAlef;
    }

    public float getDiametroAlef() {
        return diametroAlef;
    }
    public void setDiametroAlef(float diametroAlef) {
        this.diametroAlef = diametroAlef;
    }

    public float getPresionAlef() {
        return presionAlef;
    }
    public void setPresionAlef(float presionAlef) {
        this.presionAlef = presionAlef;
    }
}
