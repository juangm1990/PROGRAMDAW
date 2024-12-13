package examen6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Autobus a1= new Autobus("2383 dtb", false);
        Tractor t1= new Tractor("7625 hyg", false);

        int caso;
        do {
            Scanner sc =new Scanner(System.in);
        

        System.out.println("¿Que quieres hacer?");
        System.out.println("1.Alquilar Autobus");
        System.out.println("2.Devolver Autobus");
        System.out.println("3.Calcular precio Autobus");
        System.out.println("4.Alquilar Tractor");
        System.out.println("5.Devolver Tractor");
        System.out.println("6.Calcular precio Tractor");


         caso=sc.nextInt();

         switch (caso) {
            case 1: t1.alquilar();
               
                
                break;
                case 2:
                t1.devolver();
                
                break;
                case 3:
                t1.importe();
                
                break;
                case 4:
                a1.alquilar(40);
                
                break;
                case 5:
                a1.devolver(60);
                
                break;
                case 6:
                a1.importe();
                
                break;
         
            default:
                break;
         }







    } while (caso!=0);

        
    }
    
}
