package Entornos;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Javi", "Ruiz", "10/09/1987", 37);
        System.out.println(p1);

        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        p1.setNombre("Gonzalo");
        System.out.println(p1);

        Dni d1 = new Dni("12345678");
        System.out.println(d1);

        Dni d2 = new Dni("12345678", 'B');
        System.out.println(d2);

        Persona p3 = new Persona("Alejandro", "Santos", "05/09/2005", 19);
        Dni d3 = new Dni("12345678");
        p3.setDni(d3);

        System.out.println(p3.getDni().getLetra());

        Persona p4 = new Persona("Antonio", "Moyano", "12/21/2000", 20);
        Dni d4 = new Dni("31000307");
        p4.setDni(d4);
        System.out.println(p4.getDni());
    }
}