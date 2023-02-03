package org.bedu.java.jse.basico.sesion4.ejemplo2;

public class MainAlef {
    public static void main(String[] args) {
        // Aquí sí hay constructor!, pero no getter y setter
        AutomovilAlef a1 = new AutomovilAlef("Ford", "Anglia", 1975, 200_000);
        AutomovilAlef a2 = new AutomovilAlef("Rebelde", "Vaselina", 1980, 5_000);
        AutomovilAlef a3 = new AutomovilAlef("Bochito", "Beetle", 2004, 5_000);

        System.out.println("HashCode, auto 1: " + a1.hashCode());
        System.out.println("HashCode, auto 2: " + a2.hashCode());
        System.out.println("HashCode, auto 3: " + a3.hashCode());
    }
}
