package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Minutos_segundos_horas {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por pantalla:
         * Cantidad de segundos segun las horas, minutos y segundos.
         */

        Scanner input = new Scanner(System.in);

        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int cantidadTotal = 0;

        System.out.println("Introduce las horas: ");
        horas = input.nextInt();

        System.out.println("Introduce los minutos: ");
        minutos = input.nextInt();

        System.out.println("Introduce los segundos: ");
        segundos = input.nextInt();

        // Asignar una secuencia de cambio de tiempo y resultado
        cantidadTotal = ((horas*3600)+(minutos*60)+segundos);

        System.out.println(cantidadTotal);

        input.close();
    }
}