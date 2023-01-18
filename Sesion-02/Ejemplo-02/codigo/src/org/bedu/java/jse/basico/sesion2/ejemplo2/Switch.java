package org.bedu.java.jse.basico.sesion2.ejemplo2;

public class Switch {
    public static void main(String[] args) {
        /*
        Estructura de decisión:
        * Permite alterar el flujo de ejecución de acuerdo a una condición
        * Una condición es un valor booleano (true or false)
        
        if. Decisión simple
        if-else. Decisión doble
        if-else-if, switch. Decisión múltiple
        
        Switch:
        * No usa condiciones explícitas, sino valores
        * Cada "switch" inicia con case, segido del valor esperado
        * Cada "switch" se cierra con break; para evitar problemas
         */



        //Primer switch, calificaciones
        /*
        String mensaje; // String es una clase reservada
        byte calificacion = 5;
        
        switch(calificacion) { // Ponemos calificacion porque es el valor a comparar
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
            case 8: // Si es 9 u 8. Como no le ponemos instrucción al 9, se va al 8. No le podemos poner OR. Alternativo: case 9,8:
                mensaje = "¡Muy bien!";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default :
                mensaje = "Mejor vuelve a intentarlo"; // No es necesario poner break en el último bloque.
        }
        
        System.out.println("Tu calificación es " + calificacion + ". " + mensaje);
        */

        //Segundo switch, meses para terminar el año
        String mesActual = "agosto";

        switch (mesActual){
            case "enero":
                /*
                System.out.println("febrero");
                break;
                Con esto no salen todos los meses. Usaremos el funcionamiento en cascada de switch para imprimir todos los meses al omitir break.
                 */
                System.out.print("febrero,"); // Con este código se imprime en una línea todos los resultados y no un resultado por línea.
            case "febrero":
                System.out.print(" marzo,");
            case "marzo":
                System.out.print(" abril,");
            case "abril":
                System.out.print(" mayo,");
            case "mayo":
                System.out.print(" junio,");
            case "junio":
                System.out.print(" julio,");
            case "julio":
                System.out.print(" agosto,");
            case "agosto":
                System.out.print(" septiembre,");
            case "septiembre":
                System.out.print(" octubre,");
            case "octubre":
                System.out.print(" noviembre,");
            case "noviembre":
                System.out.print(" diciembre.");
        }


    }
}
