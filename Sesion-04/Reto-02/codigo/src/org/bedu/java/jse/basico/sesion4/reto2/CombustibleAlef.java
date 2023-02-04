package org.bedu.java.jse.basico.sesion4.reto2;

public class CombustibleAlef {
    private short litrosMax;
    private short litrosAhora;
    public CombustibleAlef(short litrosMax, short litrosAhora) {
        this.litrosMax = litrosMax;
        this.litrosAhora = litrosAhora;
    }
    
    // Método
    public void restarLitros() {
        litrosAhora--;
        System.out.println("Quedan " + litrosAhora + " litros.");
    }

    /**
     * @return short return the litrosMax
     */
    public short getlitrosMax() {
        return litrosMax;
    }

    /**
     * @param litrosMax the litrosMax to set
     */
    public void setlitrosMax(short litrosMax) {
        this.litrosMax = litrosMax;
    }

    /**
     * @return short return the litrosAhora
     */
    public short getlitrosAhora() {
        return litrosAhora;
    }

    /**
     * @param litrosAhora the litrosAhora to set
     */
    public void setlitrosAhora(short litrosAhora) {
        this.litrosAhora = litrosAhora;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + litrosMax;
        result = prime * result + litrosAhora;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CombustibleAlef other = (CombustibleAlef) obj;
        if (litrosMax != other.litrosMax)
            return false;
        if (litrosAhora != other.litrosAhora)
            return false;
        return true;
    }

    

}
