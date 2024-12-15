package Tareas.Tema_8;

public class Reloj {
        
    private Contador horas;
    private Contador minutos;
    private Contador segundos;

    public Reloj() {

        this.horas = new Contador();
        this.minutos = new Contador();
        this.segundos = new Contador();
    }

    public Reloj(Contador h, Contador m, Contador s) {

        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    public Reloj(Reloj copia) {
    
        this.horas = copia.horas;
        this.minutos = copia.minutos;
        this.segundos = copia.segundos;
    }

    public Contador getHoras() {
        return horas;
    }

    public void setHoras(Contador horas) {
        this.horas = horas;
    }

    public Contador getMinutos() {
        return minutos;
    }

    public void setMinutos(Contador minutos) {
        this.minutos = minutos;
    }

    public Contador getSegundos() {
        return segundos;
    }

    public void setSegundos(Contador segundos) {
        this.segundos = segundos;
    }

    public void incrementar() {

        this.segundos.incrementar();

        if (this.segundos.getNum() == 60) {

            this.segundos.setNum(0);
            this.minutos.incrementar();
        }

        if (this.minutos.getNum() == 60) {
            
            this.minutos.setNum(0);
            this.horas.incrementar();
        }

        if (this.horas.getNum() == 24) {

            this.horas.setNum(0);
        }
    }

    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}
