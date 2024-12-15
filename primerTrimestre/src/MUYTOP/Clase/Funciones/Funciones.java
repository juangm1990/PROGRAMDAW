package Clase.Funciones;

public class Funciones {
    public static void main(String[] args) throws Exception {
        
        boolean resultado = esPrimo(10);

        if (resultado == true) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        // -------------------------------------------------------------------

        if (calcularLetraDNI(63947585) == 'B') {
            System.out.println("Se ha encontrado la letra B");
        } else {
            System.out.println("KO");
        }

        // -------------------------------------------------------------------

        int[] desordenados = {3, 4, 2, 1, 5};
        int[] ord = ordenarAscendente(desordenados);

        for (int i = 0; i < desordenados.length; i++) {
            System.out.println(ord[i]);
        }
    }

    public static boolean esPrimo(int numero) {

        return true;
    }

    public static char calcularLetraDNI(int dni) {

        char letra = 'B';

        // lógica del método

        return letra;
    }

    public static int[] ordenarAscendente(int[] numeros) {

        int[] ordenados = {1, 2, 3, 4, 5};

        return  ordenados;
    }
}
