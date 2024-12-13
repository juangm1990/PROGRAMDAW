import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) throws Exception {
        int totalnum=0;
        int num=0;
    
        int mayor=0;
        int menor=0;
        int igual=0;
        Scanner nc=new Scanner(System.in);
        System.out.println("introduzca los numeros que desea introducir");
          totalnum=nc.nextInt();

          for(int i=totalnum;i>0;i--){
            System.out.println("introduzca un numero");
           num=nc.nextInt();
           if(num<0){
            menor++;
           }
           if(num>0){
            mayor++;
           }
           if(num==0){
            igual++;
             }
       
    }

    System.out.println("Se han introducido "+mayor+" numeros mayores que 0, "+igual+" numero igual a 0 y "+menor+" numero menor que 0");

    nc.close();
}}
