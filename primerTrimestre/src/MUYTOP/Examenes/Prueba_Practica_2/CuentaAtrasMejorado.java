package Examenes.Prueba_Practica_2;

import java.util.Scanner;

public class CuentaAtrasMejorado {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int segundos = 0;
        int h, m, s = 0;
        int hr, mr = 0;

        System.out.print("Indica de cuántos segundos quieres la cuenta atrás: ");
        segundos = input.nextInt();

        for (int i = segundos; i >= 0; segundos--) {

            h = segundos / 3600;
            hr = segundos % 3600;
            m = hr / 60;
            mr = hr % 60;
            s = mr;

            System.out.println(h + " : " + m + " : " + s);
            Thread.sleep(1000);
        }
        
        input.close();
    }
}
