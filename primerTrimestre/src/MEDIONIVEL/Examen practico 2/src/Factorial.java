import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner nc = new Scanner(System.in);
        int i=0;
        int dato=0;
        int facto=1;
        System.out.println("introduzca el numero para factorial");
          dato=nc.nextInt();
      

        for(i=dato;i>0;i--){
         
          facto*=i;
        }
        System.out.println("El factorial es "+facto);
        nc.close();
    }
    
}
