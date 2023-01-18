package org.bedu.java.jse.basico.sesion2.ejemplo1;

public class Primitivos {
    public static void main(String[] args) {
        //Creación de variables y asignación de valores.
            // Declarar variables:
            // tipo nombre;

            // Inicialización de variables:
            // nombre = valor;

            // Declaración e inicialización al mimso tiempo
            // tipo nombre = valor;

        // Enteros
        byte valorByte = 1; // byte u 8 bits
        short valorShort = 2; // bytes o 16 bits
        int valorInt = 4; // bytes o 32 bits
        long valorLong = 8L; // bytes o 64 bits, se le pone L para saber que es Long. Si no se pone L se pone int por default, no marca error porque cabe int dentro de Long. Da igual si pones L en mayúscula o minúscula.

        // Decimales/Reales/flotantes
        float valorFloat = 1.5F; // Como con Long, se añade postfijo F. No se puede hacer float sin F al final. No importa si F es mayúscula o minúscula
        double valorDouble = 1.5; // 64 bits para decimales, 15 dígitos.

        boolean valorBoolean = true;
        char valorChar = 'B'; // Comillas simples, se puede poner el valor de emotíconos con ASCII

        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);


        //casteo de valores primitivos
        float numFloat = 1.5f; // Declarar
        int numInt1 = (int)numFloat; // Se coloca entre paréntesis el tipo de dato al cual hay que hacer casteo. numFloat lo quiero convertir a int. 
        System.out.println("numInt1: " + numInt1); // El resultado es que trunca todo lo que está después del punto.

        char numChar = 'M';
        int numInt2 = (int)numChar; // Nos devuelve el código que tiene en la tabla ASCII (al convertirlo a int). Esto también sucede si ponemos '3', no se convierte en 3, sino en su equivalente de ASCII
        System.out.println("numInt2: " + numInt2);

        // JAVA NO PERMITE CASTING DE BOOLEANO A INT (0,1):
            //boolean numBool = true;
            //int numInt3 = (int) numBool;
            //System.out.println("numInt3: " + numInt3);

        //Operaciones aritméticas
        System.out.println("valorInt: " + valorInt);
        valorInt = valorInt + 1;
        System.out.println("valorInt: " + valorInt);
        valorInt++;
        System.out.println("valorInt: " + valorInt);
        valorInt += 1; // Operación compuesta
        System.out.println("valorInt: " + valorInt);


        valorChar++;
        System.out.println("valorChar: " + valorChar);
        valorChar = (char)(valorChar + valorInt);
        System.out.println("valorChar: " + valorChar); // De B se pasa a F (valorInt se fue alterando en el bloque previo)
    }
}
