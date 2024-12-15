package Clase;

public class Letras {
    public static void main(String[] args) throws Exception {
        
        //El char pasa a int porque coge el código ASCII, iguaol se le pueden sumar cosas al char, pero es mejor cuando pasa a int
        char letra ='A';
        int letraN = letra;

        System.out.println((char)(letraN+32));

    }
}
