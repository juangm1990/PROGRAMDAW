package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Divisionconresto {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Numero entero cambiado de signo.
         */

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int restodivision = 0;

        System.out.println("Introduce el primer número: ");
        num1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = input.nextInt();

        restodivision = num1 % num2;
        System.out.println("El resto de la división es: " + restodivision);

        input.close();
    }
}