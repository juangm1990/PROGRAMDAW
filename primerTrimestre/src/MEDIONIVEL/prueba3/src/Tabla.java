public class Tabla {

    public static void main(String[] args) throws Exception {

        int[] numeros = { 4, 5, 10, 2, 3 };
        int tabla = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= 10; j++) {

                tabla = numeros[i] * j;
                System.out.println("" + tabla);

            }

        }

    }
}
