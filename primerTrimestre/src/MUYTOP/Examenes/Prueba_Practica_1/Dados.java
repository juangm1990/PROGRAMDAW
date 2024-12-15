package Examenes.Prueba_Practica_1;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int dado = 0;
        String dado1 = "seis";
        String dado2 = "cinco";
        String dado3 = "cuatro";
        String dado4 = "tres";
        String dado5 = "dos";
        String dado6 = "uno";

        System.out.println("Introduce el resultado de la cara que te ha salido al lanzar el dado");
        dado=input.nextInt();

        switch (dado) {
            case 1:
                System.out.println(dado1);
                break;
            case 2:
                System.out.println(dado2);
                break;
            case 3:
                System.out.println(dado3);
                break;
            case 4:
                System.out.println(dado4);
                break;
            case 5:
                System.out.println(dado5);
                break;
            case 6:
                System.out.println(dado6);
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
                break;
        }
    
        input.close();
    }
}
