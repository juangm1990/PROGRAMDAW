import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int caso = 0;
        do {

            System.out.println("Escoja la opciones que quiera: ");
            System.out.println("1.Convertir Euros a Dolares ");
            System.out.println("2.Convertir Euros a Libras ");
            System.out.println("3:Convertir euros a Yenes ");
            System.out.println("4.Convertir euros a todas las monedas ");
            System.out.println("0.Salir ");

            caso = sc.nextInt();
            double euros = 0;
            double total = 0;
            switch (caso) {
                case 1:
                    System.out.println("Introduce el numero de Euros");
                    euros = sc.nextInt();
                    total = euros * 0.98;
                    System.out.println("El total de dolares son " + total + "$");

                    break;
                case 2:
                    System.out.println("Introduce el numero de Euros");
                    euros = sc.nextInt();
                    total = euros * 0.87;
                    System.out.println("El total de Libras son " + total + "");

                    break;
                case 3:

                    System.out.println("Introduce el numero de Euros");
                    euros = sc.nextInt();
                    total = euros * 144.73;
                    System.out.println("El total de Yenes son " + total + "");

                    break;
                case 4:
                    System.out.println("Introduce el numero de Euros");
                    euros = sc.nextInt();

                    for (int i = 0; i < 3; i++) {

                        double[] conversion = convertirEurosAMonedas(euros);

                        System.out.println("El valor es " + conversion[i]);
                    }

                    break;
                case 0:

                    System.out.println("Fin del Programa");

                    break;

                default:
                    break;
            }

        } while (caso != 0);

    }

    public static double[] convertirEurosAMonedas(double euros) {

        double totaldol = 0;
        double totalyen = 0;
        double totallibra = 0;

        totaldol = euros * 0.98;

        totallibra = euros * 0.87;

        totalyen = euros * 144.73;
        double[] valor = { totaldol, totallibra, totalyen };

        return valor;

    }

}
