package tema1.operacionesMatematicas.normal;
public class Hipotenusa {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por pantalla:
         * Hipotenusa de un triángulo rectángulo, sabiendo sus dos catetos.
         */

        double hipotenusa = 0;
        int cateto1 = 3;
        int cateto2 = 4;

        // Para alcular el resultado como la suma de los cuadrados de los dos catetos se utiliza: Math para la RC
        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println(hipotenusa);
    }
}