package Practicar.AceptaElReto;

import java.util.Scanner;

public class Condicionales_103_Nochevieja {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        String hora = "";
        int horaNum = 0;
        int minutosNum = 0;
        int minutosSuma = 0;
        int dia = 0;
        int minutosResto = 0;

        System.out.print("Introduce una hora en un formao de 24H: ");
        hora = input.next();

        horaNum = Integer.parseInt(hora.charAt(0) + "" + (hora.charAt(1)));
        minutosNum = Integer.parseInt(hora.charAt(3) + "" + (hora.charAt(4)));
        
        minutosSuma = horaNum * 60 + minutosNum;

        dia = 60 * 24;

        minutosResto = dia - minutosSuma;

        System.out.println("Quedan " + minutosResto + " minutos para medianoche.");

        input.close();
    }
}
