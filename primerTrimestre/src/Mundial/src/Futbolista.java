public class Futbolista extends Persona implements Deportista {
    
    private int dorsal;
    private String demarcacion;
    // Atributo de la clase (no del Objeto) Futbolista.maxFutbolista();
    public final static int MaximoFutbolista = 26;

    public Futbolista() {
        super();
        this.dorsal = 0;
        this.demarcacion = null;
    }

    public Futbolista(int id, String nom, String apell, String fechaNac, double peso, double altura, int dorsal, String demar) {
        super(id, nom, apell, fechaNac, peso, altura);
        this.dorsal = dorsal;
        this.demarcacion = demar;
    }

    public Futbolista(Futbolista copia) {
        super(copia);
        this.dorsal = copia.dorsal;
        this.demarcacion = copia.demarcacion;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dor) {
        this.dorsal = dor;
    }

    public String getDemarcacion() {
        return this.demarcacion;
    }

    public void setDemarcacion(String de) {
        this.demarcacion = de;
    }

    // Métodos personalizados que hacen referencia al objeto actual: Futbolista
    @Override
    public void viajar() {
        System.out.println("El futbolista está viajando" + this);
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista está entrenando" + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista está jugando partido" + this);
    }

    @Override
    public boolean tieneSobrepeso() {

        return (this.peso / (this.altura * this.altura)) > 22;
    }

    @Override
    public String toString() {
        return "Futbolista = " + super.toString() + " | Dorsal: " + dorsal + " | Demarcacion: " + demarcacion;
    }
}
