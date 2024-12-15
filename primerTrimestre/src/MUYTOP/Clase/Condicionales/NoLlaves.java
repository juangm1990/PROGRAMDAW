package Clase.Condicionales;

public class NoLlaves {
    public static void main(String[] args) throws Exception {
        
        int edad = 5;

        //El 'if' podría ir sin llaves, pero en este caso sólo se ejecutaría la primera instrucción
        if(edad>=18)
            System.out.println("Me llamo Javi");
            System.out.println("Usted es mayor de edad");

            //En este caso sólo saldría la segunda, se salta la condición de la primera y sale la siguiente instrucción
    }
}
