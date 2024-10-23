package tema3;
import java.util.Scanner;

public class While {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca un número distinto de cero");
        
        int n = input.nextInt();

        while (n != 0) {
            //Acciones 
            System.out.println("Introduzca el numero de cero");
            n = input.nextInt();
        }

        input.close();
    }
}
