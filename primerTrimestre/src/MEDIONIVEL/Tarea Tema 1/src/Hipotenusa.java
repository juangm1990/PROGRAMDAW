import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) throws Exception {
        int cat1=0;
        int cat2=0;
        double hipo=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un cateto");
        cat1=sc.nextInt();
        System.out.println("Introduzca el otro cateto");
        cat2=sc.nextInt();

        hipo=Math.sqrt(cat1*cat1+cat2*cat2);
        System.out.println("La Hipotenusa de su triangulo es "+hipo);
    }
}
