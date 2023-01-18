package org.bedu.java.jse.basico.sesion2.reto2;

public class ifAlef {
    public static void main(String[] args) {

        //Primer switch, calificaciones
        /*
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

        String mensaje = ""; // String es una clase reservada y hay que asignarla para evitar errores.
        byte calificacion = 8;
        
        if (calificacion == 10) {
            mensaje = "Excelente ¡Felicidades!";
        }
        else if (calificacion == 9 | calificacion == 8) {
            mensaje = "Muy bien!";
        }
        else if (calificacion == 7) {
            mensaje = "Aprobaste";
        }
        else if (calificacion == 6) {
            mensaje = "Panzaste";
        }
        else if (calificacion <= 5) {
            mensaje = "Tendrás que intentarlo de nuevo";
        }
        System.out.println(mensaje + ", obtuviste " + calificacion);
    }
    
}
