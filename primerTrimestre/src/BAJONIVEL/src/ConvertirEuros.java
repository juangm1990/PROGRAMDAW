import java.util.Scanner;

public class ConvertirEuros {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double euros = 0;
    double[] monedas = {0.98,0.87,144.73};
    int opcion = 0;
    do{
    System.out.println("Introduce el número para convertir euros a esa moneda: ");
    System.out.println("1. Convertir euros a dólares ");
    System.out.println("2. Convertir euros a libras ");
    System.out.println("3. Convertir euros a yenes ");
    System.out.println("4. Convertir euros a todas las monedas ");
    System.out.println("0. Salir");
    opcion = sc.nextInt();
    switch (opcion) {
      case 1:
      System.out.println("Introduce los euros:");
        euros = sc.nextDouble();
  
           System.out.println(euros +" euros son " + convertirEurosAMonedas(monedas[0])); 
            
       
        break;
      case 2:
      System.out.println("Introduce los euros:");
        euros = sc.nextDouble();
        for(int i = 0; i < monedas.length; i++){
          if (monedas[1]==i) {
           System.out.println(euros +" euros son " + convertirEurosAMonedas(monedas[1])); 
            
          }
        }

        break;
      case 3:
      System.out.println("Introduce los euros:");
        euros = sc.nextDouble();
        for(int i = 0; i < monedas.length; i++){
          if (monedas[2]==i) {
           System.out.println(euros +" euros son " + convertirEurosAMonedas(monedas[2])); 
            
          }
        }

        break;
      case 4:
      System.out.println("Introduce los euros:");
        euros = sc.nextDouble();
       
        break;
      case 0:
        System.out.println("Salirnedo del programa...");
    

      default:
        System.out.println("Opción incorrecta. Vuelva a intentarlo de nuevo");

        break;
    }
  } while (opcion != 0);

    sc.close();

  }

  public static double[] convertirEurosAMonedas(double e) {


    double[] monedas ={0.98, 0.87, 144.73};
    monedas[0] = monedas[0] * e;
    monedas[1] = monedas[1] * e;
    monedas[2] = monedas[2] * e;
    
    return monedas;
  }
}
