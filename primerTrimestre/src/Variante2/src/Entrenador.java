public class Entrenador extends Persona implements Deportista{
    private int idFederacion;
    public Entrenador(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, int idFederacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.idFederacion = idFederacion;
    }
    @Override
    public void viajar() {
        System.out.println("viajar "+this);
    }
    public int getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
    public void entrenar() {
        System.out.println("entrenando");
    }
    @Override
    public void jugarPartido() {
        System.out.println("observando encuentro");
    }
    @Override
    public boolean tieneSobrepeso() {
        return (super.peso/(super.altura*super.altura)) >25;
    }
}