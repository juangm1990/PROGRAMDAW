

public class App {
    public static void main(String[] args) throws Exception {
        Contador c1 = new Contador(0);
        Contador c2 = new Contador(0);
        Contador c3 = new Contador(0);

        
        Reloj r1 = new Reloj(c1, c2, c3);
        c3.incrementar();
        System.out.println(r1);
        while(true){
        r1.incrementarh();
        System.out.println(r1);
        Thread.sleep(1000);
        }
    }
}
