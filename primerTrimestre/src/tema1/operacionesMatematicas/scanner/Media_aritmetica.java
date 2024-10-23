package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Media_aritmetica {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Media aritmética de tres numeros reales.
         */

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double media =0;

        System.out.println("Introduce el primer número");
        num1 = input.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = input.nextInt();

        System.out.println("Introduce el tercer número");
        num3 = input.nextInt();

        // Asegurarse de usar 3(punto)0 para obtener un resultado decimal.
        media = ((num1+num2+num3)/3.0);
        System.out.println("La media es: "+media);
        

        input.close();
    }
}