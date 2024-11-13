package relaciones.composicion.libro;

public class Main {
    
    public static void main(String[] args) {
        


        Libro libroprogramacion = new Libro("Introducción a Java", 666333);

        libroprogramacion.agregarPagina(1, "Capitulo 2");
        libroprogramacion.agregarPagina(2, "Capitulo 2");


        System.out.println(libroprogramacion.toString());

    }
    
}
