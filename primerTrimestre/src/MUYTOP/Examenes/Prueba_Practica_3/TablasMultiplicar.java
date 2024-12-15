package Examenes.Prueba_Practica_3;

public class TablasMultiplicar {
    public static void main(String[] args) throws Exception {
        
        int[] array = {4, 5, 10, 2, 3};
        int multiplicacion = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <= 10; j++) {
                multiplicacion = array[i] * j;
                System.out.println(array[i] + " x " + j + " = " + multiplicacion);
            }

            System.out.println("------------------------------");
        }
    }
}
