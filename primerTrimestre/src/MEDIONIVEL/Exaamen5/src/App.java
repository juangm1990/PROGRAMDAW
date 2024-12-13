public class App {
    public static void main(String[] args) throws Exception {
         
       Persona p1 = new Persona("Raul", "Henares Palacios","+34123456789101");
        
        Contrato c1 = new Contrato(0, "hola", "hola");
        p1.setContrato(c1);
        System.out.println(p1);
     

        Persona p2 = new Persona("Antonio"," E", "+32222");
        Contrato c2= new Contrato();
        p2.setContrato(c2);
      System.out.println(p2);
       System.out.println(p2.getContrato().getSalario());


    }
}
