package PRIMER_TRIMESTRE.tema4.matrices.pintarmatrices.normal.arboldenavidad;

public class Arbolcontronco {
    public static void main(String[] args) throws Exception {

        /*
         * PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo).
         * 
         *   0 1 2 3 4
         * 0     *        --> j (lateral)
         * 1    * *       |
         * 2   * * *      ↓
         * 3  * * * *     i (abajo)
         * 4 * * * * *
         *       *    
         */        

        for (int i = 0; i < 5; i++) {
            // Bucle para imprimir espacios
            for (int j = 4; j > i; j--) {
                System.out.print(" "); // Imprime espacios
            }
            // Bucle para imprimir asteriscos
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Imprime asteriscos
            }
            // Salto de línea después de cada nivel
            System.out.println();
        }
        // Imprimir el tronco del árbol
        System.out.println("    *"); // Tronco centrado
    }
}