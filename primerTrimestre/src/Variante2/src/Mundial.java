import java.util.ArrayList;
public class Mundial {
    private int id;
    private int anyo;
    private ArrayList<SeleccionFutbol>selecciones;
    public Mundial(int anyo, int id) {
        this.anyo = anyo;
        this.id = id;
        this.selecciones = new ArrayList<>();
    }
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void anyadirSeleccion(int id,String nombre){
        SeleccionFutbol seleccionFutbol = new SeleccionFutbol(id, nombre);
        this.selecciones.add(seleccionFutbol);
    }
    public void quitarSeleccion(int id){
        this.selecciones.remove(id-1);
    }
    public SeleccionFutbol getSeleccion(int id){
        return this.selecciones.get(id-1);
    }
    public String listarSelecciones(){
        StringBuilder listadoSelecciones = new StringBuilder();
        for (int i = 0; i<this.selecciones.size();i++){
            listadoSelecciones.append(i+1);
            listadoSelecciones.append(": ");
            listadoSelecciones.append(this.selecciones.get(i));
            listadoSelecciones.append(", ");
        }
        return listadoSelecciones.toString();
    }
    @Override
    public String toString() {
        return "Mundial{" +
                "id=" + id +
                ", anyo=" + anyo;
    }
}