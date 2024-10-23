package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Grados_temperatura {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Convertir grados centígrados a Fahrenheit.
         */

        Scanner input = new Scanner(System.in);

        double centigrados = 0;
        double fahrenheit = 0;

        System.out.println("Introduce el número de grados centígrados: ");
        centigrados = input.nextInt();

        // Asegurarse de usar NÚMERO(punto)0 para obtener un resultado decimal.
        fahrenheit = 32+((9*centigrados)/5.0);

        System.out.println(centigrados+" grados centígrados son "+fahrenheit+" Fahrenheit");


        input.close();
    }
}