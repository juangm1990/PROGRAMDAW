public class Actividad15 {

    public static void main(String[] args) throws Exception {

        /*Vamos a mezclar array con funcion, comprobar si un numero es primo*/


        /*DNI */

        if(calcularLetraDni(dni:654654)=='B'){
            System.out.println("he encontrado la letra b");
        }
        else{
            System.out.println("KO");
        }

/*es primo */
     int [] numeros = {3,6,7,11};//cantidad de primos 3
     int cant=0;

     for(int i=0;i<numeros.length;i++){

      if (esPrimo(numeros[i])==true){
        cant++;
      }
     }

        boolean resultado=esPrimo(10);

        if (resultado==true){
            System.out.println("El numero es primo");
        }
           
       else {
        System.out.println("El numero no es primo");
        }


    }

    /*para poner otros metodo se ponen aqui en la clase */

    public static boolean esPrimo(int numero){
        int cant=0;

        for(int i=numero;i>=1;i--){
            if(numero%i==0){
            cant++;
            }
        }
     if (cant==2) {
        
     
        return true;}
        
        else{
            return false;
        }
    }
    
    //logica metodo
     public static char calcularDni(int dni){

    return 'B';
}
}
