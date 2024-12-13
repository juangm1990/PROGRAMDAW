import java.util.Scanner;
public class Media {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
    double total = 0;
    int cantidad = 10;
    int[] numeros = new int[cantidad];
    System.out.println("Introduce los 10 números del array");
    for (int i = 0; i < cantidad; i++) {
        numeros[i] = sc.nextInt();  
    }
    for(int i = 0; i< numeros.length; i++){
        if (numeros[i]%2 == 0 || numeros[i] == 0) {
            total = total+ numeros[i];
        }
    }
    total = total/5;
    System.out.println("La media es " + total);
    sc.close();
}
}
