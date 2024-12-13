public class Actividad16 {
    
    public static void main(String[] args) throws Exception {


/*ordenar con array y funcion */

        int[] entrada={3,45,2,1};
        int [] ord =ordenarAsc(entrada);

        for(int i=0;i<ord.length;i++){

           System.out.println(ord[i]);
        }

    }

    public static int[] ordenarAsc(int[] numeros){
        int[] ordenados={1,2,3,4,5};
        return ordenados;
    }
}
