package clases.ejercicio4;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Coche c1 = new Coche("1458BGK", "Audi", "A4", "Blanco");
        Coche c2 = new Coche("1668AAA", "Peugeot", "Peugeot", "Negro");

        c1.arrancar();
        c1.acelerar(20);
        c1.acelerar(100);

        c2.arrancar();
        c2.parar();


        System.out.println(c1);
        System.out.println(c2);




    }

}
