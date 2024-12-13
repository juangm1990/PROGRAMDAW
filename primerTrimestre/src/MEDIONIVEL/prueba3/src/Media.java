import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros");

        int i;
        for (i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }
        int suma = 0;
        double media = 0;
        int cant = 1;
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                suma = suma + numeros[j];
                cant++;
            }
        }
        media = (suma + numeros[0]) / cant;
        System.out.println("La media de los numeros pares es " + media);

        sc.close();
    }
}
