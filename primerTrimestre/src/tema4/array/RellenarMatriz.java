import java.util.Scanner;

public class RellenarMatriz {

    public static void main(String[] args) {

        /*
         * Escribe un programa que pida 20 números enteros. Estos números se deben
         * introducir en un array de 4 filas por 5 columnas.
         * El programa mostrará las sumas parciales de filas y columnas igual que si de
         * una hoja de cálculo se tratara.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce los números");
            
        int numeros[][] = new int[3][3];

        //RELLENAR MATRIZ
        for (int i = 0; i < numeros.length; i++){

            for (int j = 0; j < numeros[i].length; j++) {
                
                numeros [i][j] = input.nextInt();
            }

        }

        //VISUALIZAR MATRIZ
        for (int i = 0; i < numeros.length; i++){

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros [i][j]);
            }
            System.out.println();
        }

        System.out.println();

        input.close();
    }

}