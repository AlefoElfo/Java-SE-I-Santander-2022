package org.bedu.java.jse.basico.sesion4.ejemplo2;

public class AutomovilAlef {
    private String marcaAlef;
    private String modeloAlef;
    private int anioFabricacionAlef;
    private int klometrajeAlef;

    public AutomovilAlef(String marcaAlef, String modeloAlef, int anioFabricacionAlef, int klometrajeAlef) {
        this.marcaAlef = marcaAlef;
        this.modeloAlef = modeloAlef;
        this.anioFabricacionAlef = anioFabricacionAlef;
        this.klometrajeAlef = klometrajeAlef;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        hash = prime * hash + ((marcaAlef == null) ? 0 : marcaAlef.hashCode());
        hash = prime * hash + ((modeloAlef == null) ? 0 : modeloAlef.hashCode());
        hash = prime * hash + anioFabricacionAlef;
        hash = prime * hash + klometrajeAlef;
        return hash;
    }
}
