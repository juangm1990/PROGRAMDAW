
import java.util.Scanner;

public class Menuoperaciones {
    
  public static void main(String[] args) throws Exception {
    int proceso = 0;
    
    Scanner nc = new Scanner(System.in); // Mover el Scanner fuera del bucle

    do {
      System.out.println("¿Qué operación quieres hacer? Introduzca su número:\n"
          + "1. SUMA/RESTA/MULTIPLICACIÓN/DIVISIÓN\n"
          + "2. CAMBIO DE SIGNO\n"
          + "3. MEDIA ARITMÉTICA\n"
          + "4. HIPOTENUSA\n"
          + "5. SEGUNDOS\n"
          + "6. ORDEN NÚMEROS CRECIENTE\n"
          + "7. ¿PAR O IMPAR?\n"
          + "8. SEMANAS, DÍAS Y HORAS\n"
          + "9. ¿AÑO BISIESTO O NO?\n"
          + "10. ÍNDICE MASA MUSCULAR\n"
          + "11. FACTORIAL\n"
          + "0. Salir");
      
      proceso = nc.nextInt(); // Lee la opción del usuario
      nc.nextLine(); // Consumir la nueva línea pendiente

      switch (proceso) {

        case 1: // SUMA/RESTA/MULTIPLICACIÓN/DIVISIÓN
          int num1 = 0, num2 = 0;
          double resultado = 0;
          
          System.out.println("¿Qué operación quieres hacer: sumar, restar, dividir o multiplicar?");
          String operacion = nc.nextLine(); // Leer la operación

          System.out.println("Escriba el primer número:");
          num1 = nc.nextInt();
          System.out.println("Escriba el segundo número:");
          num2 = nc.nextInt();

          if (operacion.equalsIgnoreCase("sumar")) {
              resultado = num1 + num2;
              System.out.println("El resultado de la suma es: " + resultado);
          } else if (operacion.equalsIgnoreCase("restar")) {
              resultado = num1 - num2;
              System.out.println("El resultado de la resta es: " + resultado);
          } else if (operacion.equalsIgnoreCase("dividir")) {
              if (num2 != 0) {
                  resultado = (double) num1 / num2; // Convertir a double para que no sea división entera
                  System.out.println("El resultado de la división es: " + resultado);
              } else {
                  System.out.println("Error: no se puede dividir por cero.");
              }
          } else if (operacion.equalsIgnoreCase("multiplicar")) {
              resultado = num1 * num2;
              System.out.println("El resultado de la multiplicación es: " + resultado);
          } else {
              System.out.println("Operación no válida.");
          }
          break;

        case 2: // Cambio de signo
          System.out.println("Introduzca su número:");
          num1 = nc.nextInt();
          num2 = -(num1);
          System.out.println("Su número con valor negativo es: " + num2);
          break;

        case 3: // Media
          int num3 = 0;
          double media = 0;
          
          System.out.println("Introduzca el primer número:");
          num1 = nc.nextInt();
          System.out.println("Introduzca el segundo número:");
          num2 = nc.nextInt();
          System.out.println("Introduzca el tercer número:");
          num3 = nc.nextInt();

          media = (num1 + num2 + num3) / 3.0; // Asegúrate de que la división sea decimal
          System.out.println("La media de sus tres números es: " + media);
          break;

        // Los demás casos son similares, puedes mantener su lógica pero aplicar los mismos principios
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

        case 6://Orden numeros crecientes

        System.out.println("Introduzca los numeros");
        num1=nc.nextInt();
        num2=nc.nextInt();
        num3=nc.nextInt();

        if(num1<num2&&num2<num3){
          System.out.println("Los numeros estan en orden creciente");

        }
        else{
          System.out.println("Los numeros no estan en orden creciente");

        }
  
        
        break;

        case 7://Par o impar
        System.out.println("Introduzca su numero");
        num1=nc.nextInt();
        if(num1%2==0){
          System.out.println("Su numero es par");

        }
        else{
          System.out.println("Su numero es Impar");
        }
      
          
        break;


        case 8://pasar total de horas a semanas, dias y horas
          int semanas,horasres=0;

          System.out.println("Introduzca el numero total de horas");
          horas=nc.nextInt();
          semanas=horas/168;
          dias=((horas-(168*semanas))/24);
          horasres=(horas-(dias*24))-(168*semanas);
          System.out.print("Hay un total de "+semanas);System.out.print(" semanas, "+dias);System.out.print(" dias y "+horasres);System.out.print(" horas");

        break;
        
        case 9://Año bisisesto o no

          int anyo=0;
          System.out.println("Introduzca su año");
          anyo=nc.nextInt();

          if(anyo%4==0){

            System.out.println("El anyo introducido es Bisiesto");

          }
          else{
            System.out.println("El anyo introducido No es Bisiesto");

          }
          
        break;

        case 10://Indice masa muscular
          
          double altura,peso,imc=0;

          
          System.out.println("Introduzca el peso en kg");
          peso=nc.nextInt();
          System.out.println("Introduzca la altura en metros");
          altura=nc.nextDouble();

          imc=peso/(altura*altura);

          if(imc<18.5){
            System.out.println("Bajo peso");
           }
           if(imc>=18.5 && imc<25){
            System.out.println("Normopeso");
           }
           if(imc>=25 && imc<27){
            System.out.println("Sobrepeso grado I");
           }
           if(imc>=27 && imc<30){
            System.out.println("Sobrepeso grado II");
           }
           if(imc>=30 && imc<35){
            System.out.println("Obesidad de tipo I");
           }
           if(imc>=35 && imc<40){
            System.out.println("Obesidad de tipo II");
           }
           if(imc>=40 && imc<50){
            System.out.println("Obesidad de tipo III");
           }
           if(imc>50){
            System.out.println("Obesidad de tipo IV");
             }
          

        break;

        case 11://Factorial
        int i=0;
        int dato=0;
        int facto=1;
        System.out.println("introduzca el numero para factorial");
          dato=nc.nextInt();
      

        for(i=dato;i>0;i--){
         
          facto*=i;
        }
        System.out.println("El factorial es "+facto);
        

        break;

       case 0:
         System.out.println("Saliendo del programa...");
        break;

        default:
          if (proceso != 0) {
              System.out.println("ERROR: Opción no válida.");
          }
          break;
      }

    } while (proceso != 0); // Salir si el proceso es 0

    nc.close(); // Cerrar el Scanner al final del programa
  }
}
