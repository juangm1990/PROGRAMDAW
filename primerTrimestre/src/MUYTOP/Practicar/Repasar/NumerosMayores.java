package Practicar.Repasar;

import java.util.Scanner;

public class NumerosMayores {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int contador = 0;
        int numero = 0;
        int mayor = 0;
        int igual = 0;
        int menor = 0;

        System.out.print("Cuántos números vas a introducir? ");
        contador = input.nextInt();

        do {
            if (contador <= 0) {
                System.out.println("El número debe ser un entero positivo, pon un número válido");
                contador = input.nextInt();
            }
        } while (contador <= 0);

        while(contador > 0) {
            System.out.print("Introduce un número: ");
            numero = input.nextInt();

            contador = contador - 1;

            if (numero < 0) {
                menor++;
            } else if (numero == 0) {
                igual++;
            } else {
                mayor++;
            }
        }

        System.out.println("Hay " + mayor + " números mayores de 0, " + igual + " números iguales a 0 y " + menor + " números menores de 0.");

        input.close();
    }
}
