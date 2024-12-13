import java.util.Scanner;

public class Grados {
    public static void main(String[] args) throws Exception {
        double c=0;
        double f=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime la temperatura en grados que hace ahora mismo");
        c=sc.nextInt();
        f=32+((9*c)/5);
        System.out.println("El numero de grados Fahrenheit correspondientes a esos grados centigrados es "+f);

           }
}
