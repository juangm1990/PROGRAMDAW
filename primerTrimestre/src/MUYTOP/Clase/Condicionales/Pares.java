package Clase.Condicionales;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Escribir un programa que imprima todos los números pares entre dos 
        números que se le pidan al usuario. */

        int num1 = 0;
        int num2 = 0;

        int minimo;
        int maximo;

        System.out.println("El programa te dará los numeros entre dos introducidos");
        System.out.println("Introduce tu primer numero");
        num1 = input.nextInt();
        System.out.println("Introduce tu segundo numero");
        num2 = input.nextInt();

        if (num1 < num2) {
            minimo = num1;
            maximo = num2;
        } else {
            minimo = num2;
            maximo = num1;
        }

        for (int i = minimo+1; i < maximo; i++) {
            if (i % 2 == 0) {
                System.out.println("Los números pares que se encuentran entre tu elección son:");
                System.out.println(i);
            }
        }

        input.close();
    }
}
