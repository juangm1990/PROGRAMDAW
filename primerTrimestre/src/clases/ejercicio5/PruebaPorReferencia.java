package clases.ejercicio5;

public class PruebaPorReferencia {

    public static void main(String[] args) {

        Contador c = new Contador();
        System.out.println(c);
        c.sumar();
        System.out.println(c);

    }

}
