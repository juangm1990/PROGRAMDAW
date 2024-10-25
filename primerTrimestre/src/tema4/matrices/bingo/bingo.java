package tema4.matrices.bingo;

public class bingo {

    public static void main(String[] args) throws Exception {

        /*
         * CREAR FUNCIÓN: GENERAR CARTÓN BINGO
         * 
         * ID CARTÓN
         * Matrix 3 x 9
         * Números = 1 al 90
         * Números aleatorios
         * 3 columnas --> 1 número
         * 6 columnas --> 2 números
         * Números aleatorios = 1 al noventa
         * Cada fila tiene = 25 números y 4 números ocultos
         * 
         * 9 Columnas
         * - 0 --> 1 - 9 - 2 --> 10 - 19 - 3 --> 20 - 29
         * - 4 --> 30 - 39 - 5 --> 40 - 49 - 6 --> 50 - 59
         * - 7 --> 60 - 69 - 8 --> 70 - 79 - 9 --> 80 - 90
         * 
         * CARTÓN BINGO
         * 1 * * * 40 54 63 * 81
         * * 10 23 * * 55 * 73 85
         * 2 * 26 30 45 * 68 * *
         * 
         * ¿Qué hace? Una función para generar un cartón de bingo.
         * ¿Qué recibe? No necesita nada porque lo genera solo porque los datos son
         * fijos, estáticos y comunes.
         * ¿Qué devuelve? Una matriz.
         */

        // Primero la matriz
        int[][] carton = generarCarton();
        //////////////////////////////////////////////////

        // Tercero preparamos el recorrido de la matriz
        // Fila
        // Columna
        // j<carton[i].length para recorrer el cartón
            // 0 --> [6,9]
            // 0 --> [15,18]
            // 0 --> [25]
            // 0 --> [16,90]



            for (int i = 0; i < carton.length; i++) {
                for (int j = 0; j < carton[i].length; j++) {
                    System.out.print(carton[i][j]+ " ");
                }
                System.out.println();
            //////////////////////////////////////////////////
            }

    }

    // Segundo la funsión de la matriz
    public static int[][] generarCarton() {
        int[][] carton = { { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }};

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                int numeroAleatorio = (int) Math.floor(Math.random() * 90 + 1);
                carton [i][j] = numeroAleatorio;
            }
        //////////////////////////////////////////////////
        }

        return carton;
    }

}
