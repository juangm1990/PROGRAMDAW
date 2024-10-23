package PRIMER_TRIMESTRE.tema4.matrices;
public class MatrizNormal {
    public static void main(String[] args) throws Exception {

        /* 
         * MATRIZ
         * 
         * 15  20  25  30
         * 20  30  40  50
         * 60  65  70  80
         */

        int  [][] numeros = {{15,20,25,30},{20,30,40,50},{60,65,70,80}};

        for (int i = 0; i < 3; i++){
            for (int j=0;j<4;j++){
                System.out.print(numeros [i][j]);
                System.out.print(" | "); // Para DIVIDIR los números del ARRAY se puede meter otro SOUT.
            }
            System.out.println();
        }
    }
}