package PRIMER_TRIMESTRE.tema4.funciones;

public class Funciones4 {
    public static void main(String[] args) throws Exception {

        // FUNCIÓN: Tengo una array de numeros y tengo el 3,6,7 y 11; lo que quiero es conocer que cantidad de primos hay en este array
        //
        // ¿Que hace la función? ¿Qué recibe? ¿Que devuelve?
        //
        // ENTRADA: Cada uno de los números
        // PROCESO:
        // SALIDA: Números primos
        //
        //     MAIN                                   ||     
        //                                            ||     
        //                                            ||     
        //                                            ||
        //
        // Las funciones se crean fuera del main (amarillo) y hay que declararlas arriba (rosa)

        int [] numeros = {3,6,7,11}; // Cantidad de primos = 3
        int cant = 0;

        for(int i = 0; i<numeros.length; i++){
            if (esPrimo(numeros [i])==true){
                cant++;
            }
        }
        System.out.println("Hay " + cant + " nÚmeros primos");
             
    }

    public static boolean esPrimo (int numero){
        // Lógica del método
        
        int cant = 0;
        for (int i=numero; i>=1;i--){
            if (numero%i==0){
                cant++;
            }
        }
        if (cant==2) {
            return true;
        }
        else{
            return false;
        }
        
    }

}
