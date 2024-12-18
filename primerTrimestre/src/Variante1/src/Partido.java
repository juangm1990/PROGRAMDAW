public class Partido {
    
    private SeleccionFutbol equipoLocal;
    private SeleccionFutbol equipoVisitante;
    private Arbitro arbitro;

    public Partido() {
        this.equipoLocal = null;
        this.equipoVisitante = null;
        this.arbitro = null;
    }

    public Partido(SeleccionFutbol eL, SeleccionFutbol eV, Arbitro a) {
        this.equipoLocal = eL;
        this.equipoVisitante = eV;
        this.arbitro = a;
    }

    public Partido(Partido copia) {
        this.equipoLocal = copia.equipoLocal;
        this.equipoVisitante = copia.equipoVisitante;
        this.arbitro = copia.arbitro;
    }

    public SeleccionFutbol getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(SeleccionFutbol eL) {
        this.equipoLocal = eL;
    }

    public SeleccionFutbol getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(SeleccionFutbol eV) {
        this.equipoVisitante = eV;
    }

    public Arbitro getArbitro() {
        return this.arbitro;
    }

    public void setArbitro(Arbitro a) {
        this.arbitro = a;
    }

    public void iniciarPartido() {
        System.out.println("El partido entre " + equipoLocal.getNombre() + " y " + equipoVisitante.getNombre() + " ha empezado.");
        arbitro.arbitrarPartido();
    }

    public void finalizarPartido() {
        System.out.println("El partido entre " + equipoLocal.getNombre() + " y " + equipoVisitante.getNombre() + " ha terminado.");
    }

    @Override
    public String toString() {
        return "Partido [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", arbitro=" + arbitro
                + "]";
    }
}
