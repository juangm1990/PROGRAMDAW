package examenes.prueba2;
import java.util.Scanner;

public class Pregunta1Scanner {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int suma = 0;
        
        for (int i = 0; i < 10 ; i++) {
            //(int i = 0; i < numeros.length; i++)
            System.out.print("Número " + (i) + ": ");
            numeros[i] = input.nextInt(); 
        } 

        for (int i = 0; i < numeros.length; i = i + 2) {
            suma = suma + numeros[i];
        }
        
        int media = suma / 5; 
        System.out.println("La suma de los números en posiciones pares es: " + suma);
        System.out.println("La media de la suma es " + media);
       
        input.close();
    }
}

