import java.util.Scanner;

public class Signo {
    public static void main(String[] args) throws Exception {
        int num1=0;
        int num2=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca su numero");
        num1=sc.nextInt();
        num2=-(num1);
        System.out.println("Su numero con valor negativo es "+num2);


    }
}
