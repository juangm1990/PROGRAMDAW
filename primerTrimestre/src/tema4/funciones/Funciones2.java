package PRIMER_TRIMESTRE.tema4.funciones;

public class Funciones2 {
    public static void main(String[] args) throws Exception {

        // FUNCIÓN Calcular la letra del DNI:
        //
        // ¿Que hace la función? ¿Qué recibe? ¿Que devuelve?
        //
        // ENTRADA: Numeración DNI
        // PROCESO:
        // SALIDA: Char LETRA
        //
        // If (Es primo [número])       ||
        // Sout ("Es primo")            || Calcular letra DNI (Introducir DNI) Ordenar
        // Else if ("No es primo")      ||
        // Sout ("ko")                  ||
        //
        // Las funciones se crean fuera del main (amarillo) y hay que declararlas arriba (rosa)

        if (calcularLetraDNI(654654)=='B') {
            System.out.println("La letra B");
        } else {
            System.out.println("KO");
        }
  

        

    }

    public static char calcularLetraDNI (int dni){
        
        // Lógica del método
        char letra = 'B';
        // Lógica del método
        return letra;
        
    }



}
