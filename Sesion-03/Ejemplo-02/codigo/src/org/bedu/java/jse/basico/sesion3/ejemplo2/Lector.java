package org.bedu.java.jse.basico.sesion3.ejemplo2;

import java.util.Scanner;

public class Lector {
    // Scanner
    private Scanner scanner = new Scanner(System.in); // EStas son las tripas, la funcionalidad interna del programa. Por eso es private.

    /*
     * Partes de un método:
     * - Modificador de acceso: public, private y protected
     * - Tipo de regreso
     * - Nombre
     * - Parámetro
     * - Cuerpo del método
     */

    // Mensaje
    public void muestraMensaje(String mensaje){
        System.out.print(mensaje);
    } // Void es vacío. Está vacío aquí, dentro de su clase (es como una función en python)
    // Alcance. Scope o ámbito.

    public String leeEntrada() {
        // String entrada = scanner.nextLine();
        return scanner.nextLine();
    }
}
