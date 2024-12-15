package Tareas.Tema_7;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona();
        Persona p2 = new Persona("672564896", "alejandro@gamil.com", "08/12/1998", "31017272R");
        Persona p3 = new Persona(p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.setEmail("santi@gamil.com");

        System.out.println(p2);

        if (p1.calcularLetra()) {
            System.out.println(p1);
        } else {
            p1.setDni(null);
            System.out.println(p1);
        }
    }
}
