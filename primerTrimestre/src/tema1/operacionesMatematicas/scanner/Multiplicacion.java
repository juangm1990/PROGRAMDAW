package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Suma, resta, multiplicación y división de dos números enteros.
         */

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int multiplicacion = 0;
        
        System.out.println("Introduce el primer número: ");
        num1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = input.nextInt();

        multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación es:" + multiplicacion);

        input.close();
    }
}