package PRIMER_TRIMESTRE.tema4.matrices.pintarmatrices.normal.tresRaya.numeros;

public class Izquierda {
    public static void main(String[] args) throws Exception {

        /*
         * PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)
         * 
         *   0 1 2 3 4
         * 0 - - - - *      --> j (lateral)
         * 1 - - - * -      |
         * 2 - - * - -      ↓
         * 3 - * - - -      i (abajo)
         * 4 * - - - -
         */
        
       

        for (int i = 5; i > 0; i--) {
            
            for (int j = 0; j < 5; j++) {
                
                if (i == j + 1) {
                    System.out.print(" " + i + " "); 
                } else {
                    System.out.print(" - "); 
                }
            }
            
            System.out.println();
        }
    }
}