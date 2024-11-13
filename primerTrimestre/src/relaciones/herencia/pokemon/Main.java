package relaciones.herencia.pokemon;

public class Main {
    
    public static void main(String[] args) {
        
        Bulbasur b1 = new Bulbasur("Bulbasur");
        Charmander c1 = new Charmander("Charmander");

        c1.defender(true);
        b1.atacar(c1);

        b1.defender(true);
        c1.atacar(b1);

        c1.atacar(b1);
        c1.atacar(b1);
        b1.curar();

        System.out.println(b1);
        System.out.println(c1);
    }
    
}
