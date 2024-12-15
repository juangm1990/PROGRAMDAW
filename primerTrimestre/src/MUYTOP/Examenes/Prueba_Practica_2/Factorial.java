package Examenes.Prueba_Practica_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int num = 0;
        int factorial = 1;

        System.out.print("Introduce un número: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

        input.close();
    }
}
