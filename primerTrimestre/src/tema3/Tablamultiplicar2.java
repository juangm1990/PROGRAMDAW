package tema3;
import java.util.Scanner;

public class Tablamultiplicar2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = input.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero * i);
        }

        input.close();
    }
}
