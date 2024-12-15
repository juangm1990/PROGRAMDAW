package Practicar.Repasar;

import java.util.Scanner;

public class FechaPractica {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        String fecha = "01/01/2000";
        int contador = 0;
        int diaSuma = 0;
        boolean bisiesto = false;

        System.out.println("Introduce una fecha en un formato dd/mm/yyyy");
        fecha = input.next();

        int dia = Integer.parseInt(fecha.charAt(0) + "" + fecha.charAt(1));
        int mes = Integer.parseInt(fecha.charAt(3) + "" + fecha.charAt(4));
        int anyo = Integer.parseInt(fecha.charAt(6) + "" + fecha.charAt(7) + "" + fecha.charAt(8) + "" + fecha.charAt(9));

        System.out.println("¿Cuántos días quieres sumar?");
        contador = input.nextInt();

        diaSuma = dia + contador;

        do {
            if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
                bisiesto = true;
            }
    
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (diaSuma > 31) {
                    diaSuma = diaSuma - 31;
                    mes++;
                }
            } else if (mes == 2) {
                if (bisiesto == true && diaSuma > 29) {
                    diaSuma = diaSuma - 29;
                    mes++;
                } else if (bisiesto == false && diaSuma > 28) {
                    diaSuma = diaSuma -28;
                    mes++;
                }
            } else {
                if (diaSuma > 30) {
                    diaSuma = diaSuma - 30;
                    mes++;
                }
            }
    
            if (mes == 13) {
                mes = 1;
                anyo++;
            }
        } while ((diaSuma > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) || (diaSuma > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (diaSuma > 29 && bisiesto == true && mes == 2) || diaSuma > 28 && bisiesto == false && mes == 2);
        

        System.out.println("La nueva fecha sumando " + contador + " días es: " + diaSuma + "/" + mes + "/" + anyo);

        input.close();
    }
}
