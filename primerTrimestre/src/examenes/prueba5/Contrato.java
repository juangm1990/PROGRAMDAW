public class Contrato {

    private double salario;
    private boolean jornada;
    private String clausula;

    // Por parametros


    public Contrato(double sal, boolean jor, String clau) {
        
        this.salario = salario;
        this.jornada = jornada;
        this.clausula = clausula;

    }

    // por copia
    public Contrato() {
        this(); //Hace referencia a la clase
        if (sal <= 0 && clausula.length()<500  ){
            this.salario = sal;
        this.jornada = jornada;
        this.clausula = clausula;


        }        
        public Contrato() {
        this.salario = 0;
        this.jornada = false;
        this.clausula = "";

    }

    // por copia
    public Contrato() {
        this.salario = c.salario;
        this.jornada = c.jornada;
        this.clausula = c.clausula;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isJornada() {
        return jornada;
    }

    public void setJornada(boolean jornada) {
        this.jornada = jornada;
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }




    @Override
    public String toString() {
        return "Contrato [salario=" + salario + ", jornada=" + jornada + ", clausula=" + clausula + "]";
    }

}
