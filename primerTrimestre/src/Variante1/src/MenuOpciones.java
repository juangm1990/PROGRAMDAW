import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("1.- Crear Mundial");
            System.out.println("2.- Crear Seleccion");
            System.out.println("3.- Crear Jugador");
            System.out.println("4.- Crear Entrenador");
            System.out.println("5.- Borrar Selección");
            System.out.println("6.- Borrar Jugador");
            System.out.println("7.- Borrar Entrenador");
            System.out.println("8.- Opción 8");
            System.out.println("9.- Opción 9");
            System.out.println("10.- Opción 10");
            System.out.println("0.- Salir");
            System.out.println("Elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                
                    int idMundial = 0;
                    int anyoMundial = 0;

                    System.out.println("¿Cuál es la ID del Mundial?");
                    idMundial = input.nextInt();

                    System.out.println("¿De qué año es el Mundial?");
                    anyoMundial = input.nextInt();
                
                    System.out.println(crearMundial(idMundial, anyoMundial));

                    input.nextInt();

                    break;

                case 2:
                    
                    int idSeleccion = 0;
                    String nombreSeleccion = "";
                    int seleccionarMundial = 0;

                    System.out.println("¿Cuál es la ID de la Selección?");
                    idSeleccion = input.nextInt();

                    System.out.println("¿Que nombre tiene la Selección?");
                    nombreSeleccion = input.next();

                    System.out.println("¿A qué Mundial quieres añadir la Selección? Pon el ID: ");
                    seleccionarMundial = input.nextInt();

                    for (int i = 0; i < Mundial.mundiales.size(); i++) {

                        if (Mundial.mundiales.get(i).getId() == seleccionarMundial) {

                            Mundial.mundiales.get(i).anyadirSeleccion(idSeleccion, nombreSeleccion);
                        }
                    }

                    break;

                case 3:

                    int idJugador = 0;
                    String nombreJugador = "";
                    String apellidosJugador = "";
                    String fechaNacJugador = "";
                    double pesoJugador = 0.0;
                    double alturaJugador = 0.0;
                    int idSeleccionJugador = 0;
                    
                    System.out.println("¿Cuál es la ID del Jugador?");
                    idJugador = input.nextInt();

                    System.out.println("¿Cuál es el Nombre del Jugador?");
                    nombreJugador = input.next();

                    System.out.println("¿Cuáles son los Apellidos del Jugador?");
                    apellidosJugador = input.next();

                    System.out.println("¿Cuál es la Fecha de Nacimiento del Jugador?");
                    fechaNacJugador = input.next();

                    System.out.println("¿Cuál es el Peso del Jugador?");
                    pesoJugador = input.nextDouble();

                    System.out.println("¿Cuál es la altura del Jugador?");
                    alturaJugador = input.nextDouble();

                    System.out.println("¿A qué Selección quieres añadirlo? Pon el ID: ");
                    idSeleccionJugador = input.nextInt();

                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    
                    break;

                case 7:
                    
                    break;

                case 8:
                    
                    break;

                case 9:
                    
                    break;

                case 10:
                    
                    break;

                case 0:
                    
                    System.out.println("¡Gracias por usar el programa!");

                    break;
            
                default:

                    System.out.println("Error al seleccionar opción");
                    input.nextInt();

                    break;
            }

        } while(opcion != 0);

        input.close();
    }

    public static Mundial crearMundial(int id, int anyo) {

        if (Mundial.mundiales.isEmpty()) {

            Mundial m = new Mundial(id, anyo);

            Mundial.mundiales.add(m);

            return m;

        } else {

            for (int i = 0; i < Mundial.mundiales.size(); i++) {

                if (Mundial.mundiales.get(i).getId() == id) {

                    System.out.println("El Mundial con esta ID ya se encuentra creado");

                    return null;
                }
            }

            Mundial m = new Mundial(id, anyo);

            Mundial.mundiales.add(m);

            return m;
        }
    }
}
