import java.util.ArrayList;
public class SeleccionFutbol  {
    private int id;
    private String nombre;
    private ArrayList<Persona> personas;
    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }
    public void addperson(Persona p) {
        this.personas.add(p);
    }
    public void borrarPersona(int i) {
        this.personas.remove(i-1);
    }
    public String listarJugadores() {
        StringBuilder listaJugadores = new StringBuilder();
        for (int i = 0; i < this.personas.size(); i++) {
            listaJugadores.append(i+1);
            listaJugadores.append(":");
            listaJugadores.append(this.personas.get(i).getClass());
            listaJugadores.append(": ");
            listaJugadores.append(this.personas.get(i));
            listaJugadores.append(", ");
        }
        return listaJugadores.toString();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String listarJugadoresSobrepeso(){
        StringBuilder listaJugadoresSobrepeso = new StringBuilder();
        for (int i=0;i<this.personas.size();i++){
            if (this.personas.get(i) instanceof Futbolista && ((Futbolista) this.personas.get(i)).tieneSobrepeso()){
                listaJugadoresSobrepeso.append(i+1);
                listaJugadoresSobrepeso.append(": ");
                listaJugadoresSobrepeso.append(this.personas.get(i));
                listaJugadoresSobrepeso.append(", ");
            }
        }
        return listaJugadoresSobrepeso.toString();
    }
    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}