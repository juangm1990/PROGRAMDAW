public class Actividad11 {
    public static void main(String[] args) throws Exception {

       /*La matriz no hace falta ponerla, declaras las dimensiones con numeros */ int [][]matriz={{15,20,25,30},{20,30,40,50},{60,65,70,80},{15,20,25,30},{20,30,40,50},{60,65,70,80},{15,20,25,30},{20,30,40,50},{60,65,70,80}};

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (i>=j) {
                    System.out.print("*");
                    
                }
            }
            System.out.println("");

              

        }
}}
