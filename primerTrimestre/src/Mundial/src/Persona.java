public abstract class Persona {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String fechaNac;
    protected double peso;
    protected double altura;

    //CONSTRUCTOR POR DEFECTO
    public Persona() {
        this.id = 0;
        this.nombre = null;
        this.apellidos = null;
        this.fechaNac = null;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    //CONSTRUCTOR POR PARÁMENTROS
    public Persona(int id, String nom, String apell, String fechaNac, double peso, double altura) {
        this.id = id;
        this.nombre = nom;
        this.apellidos = apell;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.altura = altura;
    }

    //CONSTRUCTOR DE COPIA
    public Persona(Persona copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.fechaNac = copia.fechaNac;
        this.peso = copia.peso;
        this.altura = copia.altura;
    }

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

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        this.nombre = ape;
    }

    public String getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(String fNac) {
        this.fechaNac = fNac;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public abstract void viajar();

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Apellidos: " + apellidos + " | FechaNac: " + fechaNac + " | Peso: " + peso + " | Altura: " + altura;
    }
}
