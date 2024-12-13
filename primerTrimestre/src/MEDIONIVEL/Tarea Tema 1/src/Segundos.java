import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) throws Exception {
        int horas=0;
        int dias=0;
        int min=0;
        int seg=0;
        int total=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el numero de dias");
        dias=sc.nextInt();
        System.out.println("Introduzca el numero de horas");
        horas=sc.nextInt();
        System.out.println("Introduzca el numero de minutos");
        min=sc.nextInt();
        System.out.println("Introduzca el numero de segundos");
        seg=sc.nextInt();

        total=dias*86400+horas*3600+min*60+seg;
        System.out.println("El total de segundos es "+total);
    }
}
