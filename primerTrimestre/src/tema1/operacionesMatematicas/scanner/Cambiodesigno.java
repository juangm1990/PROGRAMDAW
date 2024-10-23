package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Cambiodesigno {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Número entero cambiado de signo.
         */

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int cambiodesigno = 0;

        System.out.println("Introduce el número: ");
        num1 = input.nextInt();

        cambiodesigno = num1 * (-1);
        System.out.println("El número cambiado de signo es: "+cambiodesigno);

        input.close();
    }
}