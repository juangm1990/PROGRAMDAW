package relaciones.composicion.libro;

public class Main {
    
    public static void main(String[] args) {
        


        Libro libroprogramacion = new Libro("Introducción a Java", 666333);

        /*Pagina prologo = new Pagina(1, "Este libro ha sido esrito por Javi");
        Pagina indice = new Pagina(2, "Bucles");*/


        libroprogramacion.agregarPagina("");
        libroprogramacion.agregarPagina(indice);


        /*Agregación 
        Libro librobasededatos = new Libro("Base de datos", 777777);

        librobasededatos.agregarPagina(prologo);
        librobasededatos.agregarPagina(indice);
        
        System.out.println(libroprogramacion.getPaginas());*/



        System.out.println(libroprogramacion.toString());
    }
    
}
