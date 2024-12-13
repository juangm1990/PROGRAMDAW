import java.security.cert.X509CRL;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) throws Exception {
        int num1=0;
        int num2=0;
        int suma=0;
        int resta=0;
        int multiplicacion=0;
        double division=0; 

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que operacion quieres hacer sumar, restar, dividir o multiplicar");
        String operacion=sc.nextLine();
        
        System.out.println("Escriba el primer numero");
        num1=sc.nextInt();
        System.out.println("Escriba el segundo numero");
        num2=sc.nextInt();

        if (operacion.equalsIgnoreCase("sumar")){
            
            suma=num1+num2;
            System.out.println("El resultado de la suma es "+suma);

        }
        else if (operacion.equalsIgnoreCase("restar")){
            resta=num1-num2;
            System.out.println("El resultado de la resta es "+resta);
        }
        else if (operacion.equalsIgnoreCase("dividir")){
            division=num1/num2;
            System.out.println("El resultado de la division es "+division);

        }
        else if (operacion.equalsIgnoreCase("multiplicar")){
            multiplicacion=num1*num2;
            System.out.println("El resultado de la multiplicacion es "+multiplicacion);


        }

        
    }
}
