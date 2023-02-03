package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class AlumnoAlef {
    private String cursoAlef;
    private String objetivoAlef;
    private int sesionAlef;

    {
        cursoAlef = "Java. Desarrollo web";
        objetivoAlef = "Dominar Java";
        sesionAlef = 4;
    }

    {
        cursoAlef = "Java. Desarrollo Web 2023";
    }

    /**
     * @return String return the cursoAlef
     */
    public String getCursoAlef() {
        return cursoAlef;
    }

    /**
     * @param cursoAlef the cursoAlef to set
     */
    public void setCursoAlef(String cursoAlef) {
        this.cursoAlef = cursoAlef;
    }

    /**
     * @return String return the objetivoAlef
     */
    public String getObjetivoAlef() {
        return objetivoAlef;
    }

    /**
     * @param objetivoAlef the objetivoAlef to set
     */
    public void setObjetivoAlef(String objetivoAlef) {
        this.objetivoAlef = objetivoAlef;
    }

    /**
     * @return int return the sesionAlef
     */
    public int getSesionAlef() {
        return sesionAlef;
    }

    /**
     * @param sesionAlef the sesionAlef to set
     */
    public void setSesionAlef(int sesionAlef) {
        this.sesionAlef = sesionAlef;
    }

}
