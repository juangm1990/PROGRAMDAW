package Clase;

public class Casting {
    public static void main(String[] args) throws Exception {
        
        //Lo transformamos en int el número decimal
        int numero = (int)100.5;

        double numeroDouble = 100.5;
        int numeroEntero = (int)numeroDouble;

        System.out.println(numero);
        System.out.println(numeroEntero);

    }
}
