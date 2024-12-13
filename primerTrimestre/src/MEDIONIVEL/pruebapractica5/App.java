package pruebapractica5;

public class App {
    public static void main(String[] args) {


        Contrato c1=new Contrato(2000, "completa", "ldjkhfbñskjdncñs");

        Empleado e1= new Empleado("Antonio", "Moyano", "+34648606500", c1);

        System.out.println(e1);
        

    }
    
}
