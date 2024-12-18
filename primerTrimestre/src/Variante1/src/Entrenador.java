public class Entrenador extends Persona implements Deportista {
    
    private int idFederacion;
    public final static int maxEntrenador = 1; // Atributo de la Clase, no del Objeto, no hay que instanciar nada. Entrenador.maxEntrenador();

    // Constructores por Defecto, Parámetros y Copia

    public Entrenador() {
        super();
        this.idFederacion = 0;
    }

    public Entrenador(int i, String n, String ape, String fNac, double p, double a, int idFed) {
        super(i, n, ape, fNac, p, a);
        this.idFederacion = idFed;
    }

    public Entrenador(Entrenador copia) {
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    // Getters y Setters

    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idFed) {
        this.idFederacion = idFed;
    }

    // Métodos Personalizados

    @Override
    public void viajar() {
        System.out.println("Entrenador viajando" + this);
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador entrenando" + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador jugando partido" + this);
    }

    @Override
    public boolean tieneSobrepeso() {

        return (this.peso / (this.altura * this.altura)) > 25;
    }

    @Override
    public String toString() {
        return "Entrenador = " + super.toString() + " | ID_Federacion=" + idFederacion;
    }
}
