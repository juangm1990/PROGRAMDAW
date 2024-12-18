public class Arbitro extends Persona {
    
    private String categoria;

    public Arbitro() {
        super();
        this.categoria = null;
    }

    public Arbitro(int i, String n, String ape, String fNac, double p, double a, String c) {
        super(i, n, ape, fNac, p, a);
        this.categoria = c;
    }

    public Arbitro(Arbitro copia) {
        super(copia);
        this.categoria = copia.categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String c) {
        this.categoria = c;
    }

    @Override
    public void viajar() {
        System.out.println("Arbitro viajando" + this);
    }

    public void arbitrarPartido() {
        System.out.println("Será arbitrado por: " + this);
    }

    @Override
    public String toString() {
        return "Arbitro = " + super.toString() + " | Categoría=" + categoria;
    }
}
