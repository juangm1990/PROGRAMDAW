package Examenes.Prueba_Practica_2;

import java.util.Scanner;

public class MayorMenorIgual {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in)
;        
        int numero = 0;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        System.out.print("Introduce la cantidad de números que quieras evaluar: ");
        contador = input.nextInt();

        do {
            if (contador <= 0) {
                System.out.println("El número introducido debe ser positivo y mayor que 0.");
                contador = input.nextInt();
            }
        } while (contador <= 0);

        while (contador > 0) {
            System.out.print("Introduce un número: ");
            numero = input.nextInt();

            contador = contador - 1;

            if (numero > 0) {
                mayor++;
            } else if (numero == 0) {
                igual++;
            } else {
                menor++;
            }
        }

        System.out.println("En los números que has introducido hay: " + mayor + " mayores que 0; " + igual + " iguales que 0; " + menor + " menores que 0");

        input.close();
    }
}
