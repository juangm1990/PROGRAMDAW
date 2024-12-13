import java.util.Scanner;

public class Horas {
    public static void main(String[] args) throws Exception {
         int horas,minutos,segundos,segunrest=0;
         Scanner nc=new Scanner(System.in);

          System.out.println("Introduzca el numero total de segundos");
          segundos=nc.nextInt();
         for(int i=segundos;i>0;i--){
          horas=i/3600;
          minutos=((i-(3600*horas))/60);
          segunrest=(i-(minutos*60))-(3600*horas);
          System.out.print("Hay un total de "+horas);System.out.print(" horas, "+minutos);System.out.print(" minutos y "+segunrest);System.out.println(" segundos");
          Thread.sleep(1000);
        }//Cierre for

  ;
nc.close();
}
}
