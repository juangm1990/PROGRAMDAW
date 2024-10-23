package tema4.matrices.pintarmatrices.normal.piramidesNumeros;

public class Matriz_piramide3 {
    public static void main(String[] args) throws Exception {

        /*
         * PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo).
         * 
         *   0 1 2 3 4
         * 0 E E E E E      --> j (lateral)
         * 1 D D D D -      |
         * 2 C C C - -      ↓
         * 3 B B - - -      i (abajo)
         * 4 A - - - -
         */

        for (int i = 5; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                System.out.print(i);
            }
            System.out.println(); 
        }
    }
}