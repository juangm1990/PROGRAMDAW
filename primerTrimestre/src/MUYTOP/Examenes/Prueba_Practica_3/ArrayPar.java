package Examenes.Prueba_Practica_3;

import java.util.Scanner;

public class ArrayPar {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int suma = 0;
        int media = 0;

        System.out.println("Introduce los números: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (i == 0 || i % 2 == 0) {
                suma = suma + numeros[i];
            }
        }

        media = suma / 5;

        System.out.println("La media de los números en posiciones pares es: " + media);

        input.close();
    }
}
