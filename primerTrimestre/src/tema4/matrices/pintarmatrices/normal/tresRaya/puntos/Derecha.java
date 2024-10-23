package PRIMER_TRIMESTRE.tema4.matrices.pintarmatrices.normal.tresRaya.puntos;

public class Derecha {
    public static void main(String[] args) throws Exception {

        // PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)

        //   0 1 2 3 4
        // 0 * - - - -      --> j (lateral)
        // 1 - * - - -      |
        // 2 - - * - -      ↓
        // 3 - - - * -      i (abajo)
        // 4 - - - - *

        // Bucle para cada fila

       for (int i = 0; i < 5; i++) {
            // Bucle para cada columna
            for (int j = 0; j < 5; j++) {
                // Imprime un asterisco si estamos en la diagonal
                if (i == j) {
                    System.out.print(" * "); // Imprime un asterisco
                } else {
                    System.out.print(" - "); // Imprime espacios
                }
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}