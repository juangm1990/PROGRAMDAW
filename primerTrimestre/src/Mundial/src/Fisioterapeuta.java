public class Fisioterapeuta extends Persona {
    
    private int anyiosExperiencia;

    public Fisioterapeuta() {
        super();
        this.anyiosExperiencia = 0;
    }

    public Fisioterapeuta(int i, String n, String ape, String fNac, double p, double a, int anEx) {
        super(i, n, ape, fNac, p, a);
        this.anyiosExperiencia = anEx;
    }

    public Fisioterapeuta(Fisioterapeuta copia) {
        super(copia);
        this.anyiosExperiencia = copia.anyiosExperiencia;
    }

    public int getAnyiosExperiencia() {
        return this.anyiosExperiencia;
    }

    public void setAnyiosExperiencia(int anEx) {
        this.anyiosExperiencia = anEx;
    }

    @Override
    public void viajar() {
        System.out.println("Fisioterapeuta viajando" + this);
    }

    public void realizarMasaje(Futbolista f) {
        System.out.println("El Fisioterapeuta " + this.nombre + " está dando un masaje a " + f.getNombre());
    }

    public void ayudarRecuperacion(Futbolista f) {
        System.out.println("El Fisioterapeuta " + this.nombre + " está ayudando a recuperarse a " + f.getNombre());
    }

    @Override
    public String toString() {
        return "Fisioterapeuta = " + super.toString() + " | Años de Experiencia: " + anyiosExperiencia;
    }
}
