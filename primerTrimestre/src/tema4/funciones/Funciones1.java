package tema4.funciones;

public class Funciones1 {
    public static void main(String[] args) throws Exception {

        // FUNCIÓN ¿Es un número primo?:
        //
        // ¿Que hace la función? ¿Qué recibe? ¿Que devuelve?
        //
        // ENTRADA: Comprueba si es un número entero. 
        // PROCESO:
        // SALIDA: Booleano TRUE / FALSE
        //
        // If (Es primo [número])       ||
        // Sout ("Es primo")            || Boolean es primo (int numero)  }
        // Else if ("No es primo")      ||
        // Sout ("ko")                  ||
        //
        // Las funciones se crean fuera del main (amarillo) y hay que declararlas arriba (rosa)

        boolean resultado = esPrimo(7);

        if (resultado == true) {
            System.out.println("El número es primo");
        }else {
            System.out.println("El número no es primo");
        }

        

        
        

    }

    public static boolean esPrimo (int numero){
        // Lógica del método
        //
        // Lógica del método
        return true;

    }

}
