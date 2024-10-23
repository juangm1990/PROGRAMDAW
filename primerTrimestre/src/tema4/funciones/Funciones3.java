package tema4.funciones;

public class Funciones3 {
    public static void main(String[] args) throws Exception {

        // FUNCIÓN Ordenar ascendentemente una serie de numeros y me va a devolver los números ordenados:
        //
        // ¿Que hace la función? ¿Qué recibe? ¿Que devuelve?
        //
        // ENTRADA: Numeros (como tenemos que almacenar muchos datos en una variable hay que almacenarlos en una array)
        // PROCESO:
        // SALIDA: Números ordenados
        //
        //     MAIN                                   ||     Ordenar ascendentemente (int [] números  }
        // int ordenado [] = ordenarasc [3,4,5,6,7]   ||     Devolvera otro array --> [] así que hay que insertarlo antes
        //  for (i=0;i<ordenado; i++)                 ||     int [] ordenar ascendentemente (int [] mumeros)
        //  Sout (prdenados [i])                      ||
        //
        // Las funciones se crean fuera del main (amarillo) y hay que declararlas arriba (rosa)

        int [] entrada = {3,4,5,2,1};
        int [] ord = ordenarAsc(entrada);

        for (int i=0; i<ord.length;i++){
            System.out.print(ord[i]);
        }

             
        

    }

    public static int [] ordenarAsc (int [] numeros){
        // Lógica del método
        int [] ordenados = {1,2,3,4,5};
        // Lógica del método
        return ordenados;

    }

}
