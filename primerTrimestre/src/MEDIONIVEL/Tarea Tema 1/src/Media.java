import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        int num1=0;
        int num2=0;
        int num3=0;
        double med=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2=sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3=sc.nextInt();

        med=(num1+num2+num3)/3;
        System.out.println("La media de sus tres numero es "+med);



    }
}
