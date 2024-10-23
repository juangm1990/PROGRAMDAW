package tema4.matrices.pintarmatrices.normal.tresRaya.numeros;

public class Derecha {
    public static void main(String[] args) throws Exception {

        /*
         * PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)
         * 
         *   0 1 2 3 4
         * 0 A - - - -     --> j (lateral)
         * 1 - B - - -      |
         * 2 - - C - -      ↓
         * 3 - - - D -      i (abajo)
         * 4 - - - - E
         */

        // PROCESO
        
         for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                if (i == j) {
                    System.out.print(" " + (i + 1) + " "); 
                } else {
                    System.out.print(" - "); 
                }
            }
        
        // SALIDA
            System.out.println();
        }
    }
}