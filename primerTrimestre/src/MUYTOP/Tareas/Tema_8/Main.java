package Tareas.Tema_8;

public class Main {
    public static void main(String[] args) throws Exception {

        Reloj reloj = new Reloj();

        for (int i = 0; i > -1; i++) {
            System.out.println(reloj);
            reloj.incrementar();
            Thread.sleep(1000);
        }
    }
}
