package Tareas.Tema_8;

public class Contador {
        
    private int num;

    public Contador() {

        this.num = 0;
    }

    public Contador(int n) {

        this.num = n;
    }

    public Contador(Contador copia) {

        this.num = copia.num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void incrementar() {

        this.num++;
    }

    public void decrementar() {
        
        this.num--;
    }

    @Override
    public String toString() {
        return String.format("%02d", this.num);
    }
}
