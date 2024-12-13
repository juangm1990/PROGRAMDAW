public class Prueba1 {

    public static void main(String[] args) {
    
        int filas = 9; // Número de filas de la pirámide
        
        // Bucle para cada fila
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios para centrar los números
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir el número correspondiente, 'i' veces en cada fila
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Saltar a la siguiente línea
            System.out.println();
        }
}}
