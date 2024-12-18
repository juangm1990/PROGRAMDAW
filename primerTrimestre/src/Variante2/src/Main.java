import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static Scanner sc;
    static Mundial mundial;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int option;
        try {
            do {
                menu();
                option = intValue();
                if (option==1){
                    crearMundial();
                } else if (option==2) {
                    anyadirSeleccion();
                }else if (option==3){
                    anyadirPersonaSeleccion();
                } else if (option==4) {
                    borrarSeleccion();
                } else if (option==5) {
                    borrarPersonaSeleccion();
                } else if (option==6) {
                    verJugadores();
                } else if (option==7) {
                    verJugadoresSobrepeso();
                } else if (option==8) {
                    verSelecciones();
                } else if (option==0) {
                    System.out.println("saliendo del programa");
                } else {
                    System.out.println("opcion incorrecta vuelve a intentarlo");
                }
            }while (option!=0);} catch (InputMismatchException e){
            System.out.println("no valido vuelve a intentarlo");
        }
    }
    private static int intValue(){
        return Main.sc.nextInt();
    }
    private static double doubleValue(){
        return Main.sc.nextDouble();
    }
    private static String stringValue(){
        return Main.sc.next();
    }
    private static void menu(){
        System.out.println("1:Crear Mundial");
        System.out.println("2:Añadir Seleccion al mundial");
        System.out.println("3:Añadir persona a la seleccion");
        System.out.println("4:Borrar Seleccion del mundial");
        System.out.println("5:Borrar Persona de la Seleccion");
        System.out.println("6:Ver jugadores");
        System.out.println("7:Ver jugadores con sobrepeso");
        System.out.println("8: ver selecciones");
        System.out.println("0:salir");
    }
    private static void crearMundial(){
        System.out.println("de que año");
        int anyo = intValue();
        System.out.println("id?");
        int id = intValue();
        Main.mundial = new Mundial(anyo,id);
    }
    public static void anyadirSeleccion(){
        System.out.println("Introduce id");
        int id = intValue();
        System.out.println("introduce el nombre");
        String nombre = stringValue();
        Main.mundial.anyadirSeleccion(id,nombre);
    }
    public static void borrarSeleccion(){
        System.out.println("que seleccion desea eliminar:");
        System.out.println(Main.mundial.listarSelecciones());
        int i = intValue();
        Main.mundial.quitarSeleccion(i);
    }
    public static void anyadirPersonaSeleccion(){
        System.out.println("que seleccion");
        verSelecciones();
        int i = intValue();
        System.out.println("Es un jugador o un entrenador");
        String per = stringValue();
        if (per.equals("jugador")){
            System.out.println("id?");
            int id = intValue();
            System.out.println("nombre");
            String nombre = stringValue();
            System.out.println("Apellidos");
            String apellidos = stringValue();
            System.out.println("Fecha de nacimiento");
            String fechaNach = stringValue();
            System.out.println("peso?");
            double peso = doubleValue();
            System.out.println("altura?");
            double altura = doubleValue();
            System.out.println("desmarcacion?");
            String desmarcacion = stringValue();
            System.out.println("dorsal?");
            int dorsal = intValue();
            Persona persona = new Futbolista(id,nombre,apellidos,fechaNach,peso,altura,desmarcacion,dorsal);
            Main.mundial.getSeleccion(i).addperson(persona);
        } else if (per.equals("entrenador")) {
            System.out.println("id?");
            int id = intValue();
            System.out.println("nombre");
            String nombre = stringValue();
            System.out.println("Apellidos");
            String apellidos = stringValue();
            System.out.println("Fecha de nacimiento");
            String fechaNach = stringValue();
            System.out.println("peso?");
            double peso = doubleValue();
            System.out.println("altura?");
            double altura = doubleValue();
            System.out.println("id de la federacion?");
            int idFed = intValue();
            Persona persona = new Entrenador(id,nombre,apellidos,fechaNach,peso,altura,idFed);
            Main.mundial.getSeleccion(i).addperson(persona);
        }
        else {
            System.out.println("no valido");
        }
    }
    private static void borrarPersonaSeleccion(){
        System.out.println("de que seleccion");
        System.out.println(Main.mundial.listarSelecciones());
        int i = intValue();
        System.out.println("que persona");
        System.out.println(Main.mundial.getSeleccion(i).listarJugadores());
        int per = intValue();
        Main.mundial.getSeleccion(i).borrarPersona(per);
    }
    private static void verJugadores(){
        System.out.println("de que seleccion");
        verSelecciones();
        int i = intValue();
        System.out.println(Main.mundial.getSeleccion(i).listarJugadores());
    }
    private static void verJugadoresSobrepeso(){
        System.out.println("de que seleccion");
        verSelecciones();
        int i = intValue();
        System.out.println(Main.mundial.getSeleccion(i).listarJugadoresSobrepeso());
    }
    private static void verSelecciones(){
        System.out.println(Main.mundial.listarSelecciones());
    }
}