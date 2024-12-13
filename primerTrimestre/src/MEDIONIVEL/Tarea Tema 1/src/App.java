import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
      
  /*
System.out.println("su suma es");
System.out.println("su resta es");
System.out.println("su multiplicacion es");
System.out.println("su division");
System.out.println("sucambio de signo es");
System.out.println("su media es");
System.out.println("la hipotenusa es");
System.out.println("los segundos son");
System.out.println("los numeros estan en orden creciente");
System.out.println("los numeros son");
System.out.println("el total de horas es en semanas,dias y horas");
System.out.println("año bisiesto");
System.out.println("indice masa muscular");
System.out.println("factorial");
*/

Scanner nc=new Scanner(System.in);
System.out.println("¿Que operacion quieres hacer?Introduzca su numero \n1.SUMA/RESTA/MULTIPLICACIÓN/DIVISIÓN\n2.CAMBIO DE SIGNO\n3.MEDIA ARITMÉTICA\n4.HIPOTENUSA\n5.SEGUNDOS\n6.ORDEN NÚMEROS CRECIENTE\n7.¿PAR O IMPAR?\n8.SEMANAS, DÍAS Y HORAS (Realizar programa que dado un número total de horas, muestre por pantalla el número de semanas, días y horas correspondientes)\n9.¿AÑO BISIESTO O NO?\n10.ÍNDICE MASA MUSCULAR\n11.FACTORIAL");
 int opcion=nc.nextInt();


switch (opcion) {

      case 0:

   System.out.println("El programa ha finalizado");
      
      break;
      case 1://Operaciones
      
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

      break;

      case 2: //Signo
        
      
        System.out.println("Introduzca su numero");
        num1=nc.nextInt();
        num2=-(num1);
        System.out.println("Su numero con valor negativo es "+num2);
    
      
      break;

      case 3://Media

      int num3=0;
        double med=0;
        System.out.println("Introduzca el primer numero");
        num1=nc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2=nc.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3=nc.nextInt();

        med=(num1+num2+num3)/3;
        System.out.println("La media de sus tres numero es "+med);

      
      break;

      case 4://Hipotenusa

      int cat1=0;
        int cat2=0;
        double hipo=0;
        System.out.println("Introduzca un cateto");
        cat1=nc.nextInt();
        System.out.println("Introduzca el otro cateto");
        cat2=nc.nextInt();

        hipo=Math.sqrt(cat1*cat1+cat2*cat2);
        System.out.println("La Hipotenusa de su triangulo es "+hipo);
    


      
      break;

      case 5://Segundos
      int horas=0;
        int dias=0;
        int min=0;
        int seg=0;
        int total=0;
        System.out.println("Introduzca el numero de dias");
        dias=nc.nextInt();
        System.out.println("Introduzca el numero de horas");
        horas=nc.nextInt();
        System.out.println("Introduzca el numero de minutos");
        min=nc.nextInt();
        System.out.println("Introduzca el numero de segundos");
        seg=nc.nextInt();

        total=dias*86400+horas*3600+min*60+seg;
        System.out.println("El total de segundos es "+total);
      
      break;

      case 6://Orden numero creciente
      System.out.println("Introduzca 3 numeros");
      
        num1=nc.nextInt();
        num2=nc.nextInt();
        num3=nc.nextInt();
        if(num1<num2&&num2<num3){

         System.out.println("Los numeros estan introducidos en orden Creciente ");
        }
        else{
          System.out.println("Los numeros estan introducidos en orden Decreciente ");

        }

      
      break;

      case 7://Par o impar
  

        System.out.println("Introduzca su numero");
        num1=nc.nextInt();
        if(num1%2==0){
          System.out.println("El numero es Par ");


        }
        else{
          System.out.println("El numero es Impar ");

        }
        
        System.out.println("El total de segundos es ");
      
      break;
      case 8://Pasar horas a semanas,dias y horas
      int semanas=0;
      
        
        System.out.println("Introduzca el numero de horas");
        horas=nc.nextInt();

        System.out.println("Introduzca el numero de horas");
        horas=nc.nextInt();
        System.out.println("Introduzca el numero de minutos");
        min=nc.nextInt();
        System.out.println("Introduzca el numero de segundos");
        seg=nc.nextInt();

        total=dias*86400+horas*3600+min*60+seg;
        System.out.println("El total de segundos es ");
        break;

        case 9://Año bisiesto


        break;


        case 10://Indice masa muscular
        break;


        case 11://Factorial
        break;


  default:
      break;
}
        
    }
}
