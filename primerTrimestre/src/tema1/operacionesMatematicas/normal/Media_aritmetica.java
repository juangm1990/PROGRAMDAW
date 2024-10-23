package tema1.operacionesMatematicas.normal;
public class Media_aritmetica {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por pantalla:
         * Media aritmética de tres numeros reales.
         */

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double media = 0;

        // Asegurarse de usar 3(punto)0 para obtener un resultado decimal.
        media = ((num1+num2+num3)/3.0);

        System.out.println(media);
    }
}