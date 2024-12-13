import java.util.Scanner;

public class Sumatorio {
    public static void main(String[] args) throws Exception {
        Scanner nc = new Scanner(System.in);
        int i=0;
        int dato=0;
        int sumatorio=0;
        System.out.println("introduzca el numero para sumatorio");
          dato=nc.nextInt();
      

        for(i=dato;i>0;i--){
         
          sumatorio+=i;
        }
        System.out.println("El sumatorio es "+sumatorio);
        nc.close();
    } 
  
}
