package tema4.array;
public class Arraymultiplicar {
    public static void main(String[] args) throws Exception {

        // array fijo y tabla de multiplicar

        int [] numeros = {1,2,3,4};

        for (int i = 0; i < numeros.length; i++) {

            for ( int j = 0 ; j<=10 ;j++ ){

                System.out.println(numeros [i] + " x " + j + " = " + (numeros [i]* j) );

                


            }

            System.out.println("-------------------");
        }
    }
}
