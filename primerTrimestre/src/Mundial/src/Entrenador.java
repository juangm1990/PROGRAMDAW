public class Entrenador extends Persona implements Deportista {
    
    private int idFederacion;

    public Entrenador() {
        super();
        this.idFederacion = 0;
    }

    public Entrenador(int id, String nom, String apell, String fechaNac, double peso, double altura, int idFed) {
        super(id, nom, apell, fechaNac, peso, altura);
        this.idFederacion = idFed;
    }

    public Entrenador(Entrenador copia) {
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idFed) {
        this.idFederacion = idFed;
    }

    // Métodos personalizados
    @Override
    public void viajar() {
        System.out.println("El entrenador está viajando" + this);
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador está entrenando" + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador está jugando partido" + this);
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
