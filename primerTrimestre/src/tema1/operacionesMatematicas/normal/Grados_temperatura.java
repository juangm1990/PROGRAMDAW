package tema1.operacionesMatematicas.normal;

public class Grados_temperatura {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por pantalla:
         * Convertir grados centígrados a Fahrenheit.
         */

        double centigrados = 3;
        double fahrenheit = 0;

        // Asegurarse de usar NÚMERO(punto)0 para obtener un resultado decimal.
        fahrenheit = 32+((9*centigrados)/5.0);

        System.out.println(centigrados+" grados centígrados son "+fahrenheit+" grados Fahrenheit");
    }
}