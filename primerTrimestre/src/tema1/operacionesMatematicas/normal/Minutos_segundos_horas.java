package tema1.operacionesMatematicas.normal;

public class Minutos_segundos_horas {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por pantalla:
         * Cantidad de segundos segun las horas, minutos y segundos.
         */

        int horas = 1;
        int minutos = 3;
        int segundos = 0;
        int cantidadTotal = 0;

         // Asignar una secuencia de cambio de tiempo y resultado
         cantidadTotal=(horas*3600)+(minutos*60)+segundos;

         System.out.println("La cantidad de segundos segun las horas, minutos y segundos es: "+cantidadTotal);
    }
}