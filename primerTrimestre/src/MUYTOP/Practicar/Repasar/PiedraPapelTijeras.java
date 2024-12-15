package Practicar.Repasar;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int jugador = 4;
        int maquina = 0;
        String jugador2 = "";
        String maquina2 = "";
        boolean condicion = false;

        do {
            System.out.println("Qué quieres jugar? (0.- Piedra; 1.- Papel; 2.- Tijeras; -1.- Salir) ");
       

        maquina = (int) (Math.random() * 3);

        while (jugador < 0 && jugador > 2) {
            jugador = input.nextInt();
            switch (jugador) {
                case 0:
                    jugador2 = "PIEDRA";
                    break;
                case 1:
                    jugador2 = "PAPEL";
                    break;
                case 2:
                    jugador2 = "TIJERAS";
                    break;
                case -1:
                    break;
                default:
                    System.out.println("ERROR, pon un número válido");
                    break;
            }
        }

        switch (maquina) {
            case 0:
                maquina2 = "PIEDRA";
                break;
            case 1:
                maquina2 = "PAPEL";
                break;
            case 2:
                maquina2 = "TIJERAS";
                break;
        }

        System.out.println("(JUGADOR) - " + jugador2 + " VS " + maquina2 + " - (MÁQUINA)");

        Thread.sleep(1000);
        System.out.println("---------------------");
        Thread.sleep(1000);

        condicion = true;

        while (jugador == 0 && condicion == true) {
            if (maquina == 0) {
                System.out.println("EMPATE");
                condicion = false;
            } else if (maquina == 1) {
                System.out.println("DERROTA");
                condicion = false;
            } else {
                System.out.println("VICTORIA");
                condicion = false;
            }
        }

        while (jugador == 1 && condicion == true) {
            if (maquina == 0) {
                System.out.println("VICTORIA");
                condicion = false;
            } else if (maquina == 1) {
                System.out.println("EMPATE");
                condicion = false;
            } else {
                System.out.println("DERROTA");
                condicion = false;
            }
        }

        while (jugador == 2 && condicion == true) {
            if (maquina == 0) {
                System.out.println("DERROTA");
                condicion = false;
            } else if (maquina == 1) {
                System.out.println("VICTORIA");
                condicion = false;
            } else {
                System.out.println("EMPATE");
                condicion = false;
            }
        }
        } while (jugador != -1);
        
        input.close();
    }
}
