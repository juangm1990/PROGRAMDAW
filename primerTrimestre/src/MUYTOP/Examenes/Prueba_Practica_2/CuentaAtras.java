package Examenes.Prueba_Practica_2;

import java.util.Scanner;

public class CuentaAtras {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        System.out.print("Indica de cuántos segundos quieres la cuenta atrás: ");
        segundos = input.nextInt();

        horas = segundos / (60 * 60);
        minutos = segundos % (60 * 60) / 60;
        segundos = segundos % 60;

        while (horas >= 0 && minutos >= 0 && segundos >= 0) {
            System.out.println(horas + " : " + minutos + " : " + segundos);
            Thread.sleep(1000);
            segundos--;
            if (segundos == -1) {
                segundos = 59;
                minutos--;
            }
            if (minutos == -1) {
                minutos = 59;
                horas--;
            }
        }

        input.close();
    }
}
