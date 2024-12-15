package Examenes.Prueba_Practica_3;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int opcion = 0;
        double euros = 0;
        String[] divisa = {" dólares", " libras", " yenes"};

        do {

            System.out.println("¿Qué quieres realizar?");
            System.out.println("1 - Convertir euros a dólares");
            System.out.println("2 - Convertir euros a libras");
            System.out.println("3 - Convertir euros a yenes");
            System.out.println("4 - Convertir euros a todas las monedas");
            System.out.println("0 - Salir");
            System.out.print("Introduce el número correspondiente a la operación: ");
            opcion = input.nextInt();

            if (opcion >= 0 || opcion <= 4) {
                switch (opcion) {
                    case 1:
                        System.out.print("¿Qué cantidad quieres convertir? ");
                        euros = input.nextInt();
                        System.out.println(euros + " equivalen a " + convertirEurosAMonedas(euros)[0] + " dólares.");
                        break;
                    case 2:
                        System.out.print("¿Qué cantidad quieres convertir? ");
                        euros = input.nextInt();
                        System.out.println(euros + " euros equivalen a " + convertirEurosAMonedas(euros)[1] + " libras.");
                        break;
                    case 3:
                        System.out.print("¿Qué cantidad quieres convertir? ");
                        euros = input.nextInt();
                        System.out.println(euros + " euros equivalen a " + convertirEurosAMonedas(euros)[2] + " yenes.");
                        break;
                    case 4:
                        System.out.print("¿Qué cantidad quieres convertir? ");
                        euros = input.nextInt();
                        for (int i = 0; i < 3; i++) {
                            System.out.println(euros + " euros equivalen a " + convertirEurosAMonedas(euros)[i] + divisa[i] + ".");
                        }
                        break;
                    default:
                        break;
                }
            } else if (opcion < 0 || opcion > 4) {
                System.out.println("Opción incorrecta. Vuelva a intentarlo de nuevo.");
            } else {
                
            }

        } while (opcion != 0);
        
        input.close();
    }

    public static double[] convertirEurosAMonedas(double x) {

        double dolaresValor = 0.98;
        double librasValor = 0.87;
        double yenesValor = 144.73;

        double dolares = 0;
        double libras = 0;
        double yenes = 0;

        dolares = x * dolaresValor;
        libras = x * librasValor;
        yenes = x * yenesValor;

        double[] conversion = {dolares, libras, yenes};

        return conversion;
    }
}
