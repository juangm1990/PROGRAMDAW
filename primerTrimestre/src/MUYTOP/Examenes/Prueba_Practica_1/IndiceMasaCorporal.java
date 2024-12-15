package Examenes.Prueba_Practica_1;

import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double kg = 0;
        double metros = 0;
        double indiceMasaCorporal = 0;
        String situacion ="";


        System.out.println("introduce tu altura en metros");
        metros=input.nextDouble();

        System.out.println("Introduce tu peso en kilogramos");
        kg=input.nextDouble();

        indiceMasaCorporal = kg / (metros*metros);

        if(indiceMasaCorporal < 18.5) {
            situacion="bajo peso";
        } else if(indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            situacion="normopeso";
        } else if(indiceMasaCorporal >= 25 && indiceMasaCorporal < 27) {
            situacion="sobrepeso grado I";
        } else if(indiceMasaCorporal >= 27 && indiceMasaCorporal < 30) {
            situacion="sobrepeso grado II";
        } else if(indiceMasaCorporal >= 30 && indiceMasaCorporal < 35) {
            situacion="obesidad de tipo I";
        } else if(indiceMasaCorporal >= 35 && indiceMasaCorporal < 40) {
            situacion="obesidad de tipo II";
        } else if(indiceMasaCorporal >= 40 && indiceMasaCorporal < 50) {
            situacion="obesidad de tipo III (mórbida)";
        } else {
            situacion="obesidad de tipo IV (extrema)";
        }

        System.out.println("Tu IMC es de "+indiceMasaCorporal+" y estás en una situación de "+situacion);

        input.close();
    }
}
