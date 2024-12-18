import java.util.ArrayList;

public class SeleccionFutbol {
    
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes;

    // Constructores por Defecto, Parámetros y Copia

    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = null;
        this.integrantes = new ArrayList<Persona>();
    }

    public SeleccionFutbol(int i, String n) {
        this.id = i;
        this.nombre = n;
        this.integrantes = new ArrayList<Persona>();
    }

    public SeleccionFutbol(SeleccionFutbol copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.integrantes = copia.integrantes;
    }

    // Getters y Setters

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public ArrayList<Persona> getIntegrantes() {
        return this.integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> p) {
        this.integrantes = p;
    }

    // Métodos Personalizados

    public void listarIntegrantes() {

        for (int i = 0; i < this.integrantes.size(); i++) {

            System.out.println(this.integrantes.get(i));
        }
    }

    public void listarFutbolistasSobrepeso() {

        for (int i = 0; i < this.integrantes.size(); i++) {

            Persona p = this.integrantes.get(i);
            Futbolista f = null;
            Entrenador e = null;

            if (p instanceof Futbolista) {

                f = (Futbolista)p;

                if (f.tieneSobrepeso()) {

                    System.out.println(this.integrantes.get(i));
                }

            } else {

                e = (Entrenador)p;

                if (e.tieneSobrepeso()) {

                    System.out.println(this.integrantes.get(i));
                }
            }
        }
    }

    public boolean anadirPersona(Persona p) {

        if (this.integrantes.isEmpty()) {

            this.integrantes.add(p);

            return true;

        } else {

            int contador = 0;

            if (p instanceof Futbolista) {

                for (int i = 0; i < this.integrantes.size(); i++) {

                    if (this.integrantes.get(i) instanceof Futbolista) {
    
                        contador++;
                    }
                }
    
                if (contador <= Futbolista.maxFutbolista) {
    
                    for (int i = 0; i < this.integrantes.size(); i++) {
    
                        if (this.integrantes.get(i).getId() == p.getId()) {
        
                            return false;
                        }
                    }
        
                    this.integrantes.add(p);
        
                    return true;
                }
    
                return false;

            } else if (p instanceof Entrenador) {

                for (int i = 0; i < this.integrantes.size(); i++) {

                    if (this.integrantes.get(i) instanceof Entrenador) {
    
                        contador++;
                    }
                }
    
                if (contador <= Entrenador.maxEntrenador) {
    
                    for (int i = 0; i < this.integrantes.size(); i++) {
    
                        if (this.integrantes.get(i).getId() == p.getId()) {
        
                            return false;
                        }
                    }
        
                    this.integrantes.add(p);
        
                    return true;
                }
    
                return false;

            } else {
    
                for (int i = 0; i < this.integrantes.size(); i++) {
    
                    if (this.integrantes.get(i).getId() == p.getId()) {
        
                        return false;
                    }
                }
        
                this.integrantes.add(p);
        
                return true;
            }
        }
    }

    public boolean borrarPersona(int id) {

        if (this.integrantes.isEmpty()) {

            return false;

        } else {

            for (int i = 0; i < this.integrantes.size(); i++) {

                if (this.integrantes.get(i).getId() == id) {

                    this.integrantes.remove(i);

                    return true;
                }
            }

            return false;
        }
    }

    @Override
    public String toString() {
        return "Selección " + nombre + ", ID: " + id;
    }
}
