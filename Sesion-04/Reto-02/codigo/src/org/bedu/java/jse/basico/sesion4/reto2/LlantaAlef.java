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

    // // Rodar
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LlantaAlef llantaAlef = (LlantaAlef) o;
        if (Float.compare(llantaAlef.anchoAlef, anchoAlef) != 0)
            return false;
        if (Float.compare(llantaAlef.diametroAlef, diametroAlef) != 0)
            return false;
        return Float.compare(llantaAlef.presionAlef, presionAlef) == 0;
    }

    @Override
    public int hashCode() {
        int resultAlef = (anchoAlef != +0.0F ? Float.floatToIntBits(anchoAlef) : 0);
        resultAlef = 31 * resultAlef + (diametroAlef != +0.0f ? Float.floatToIntBits(diametroAlef) : 0);
        resultAlef = 31 * resultAlef + (presionAlef != +0.0f ? Float.floatToIntBits(presionAlef) : 0);
        return resultAlef;
    }
}
