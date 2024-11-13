package relaciones.herencia.pokemon;

class Charmander extends Pokemon {

    //ATRIBUTOS
    private int multiplicadornyo;

    //CONSTRUCTOR
    public Charmander (String nombre){
        super(nombre, "fuego");

        this.multiplicadornyo = 3;
    }
    
    //MÉTODO
    @Override //SOBRESCRITURA
    public void atacar (Pokemon otro){
        otro.ps = otro.ps - (100 * multiplicadornyo);
    }
    
}