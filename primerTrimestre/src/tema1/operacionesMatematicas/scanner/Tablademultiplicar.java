package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Tablademultiplicar {
    public static void main(String[] args) throws Exception {

         /*
         * Mostrar por consola:
         * Tabla de multiplicar del 5.
         */

        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = input.nextInt();

        for(int i = 0; i<=10; i++){

            System.out.println(num + "x" + i + " = " + (num*i));

            input.close();
        }

    }
}
