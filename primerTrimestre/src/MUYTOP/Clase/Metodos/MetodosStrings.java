package Clase.Metodos;

public class MetodosStrings {
    public static void main(String[] args) throws Exception {
        
        String frase = "castillo amarillo";

        String nuevaFrase = frase.replace('a', '-');

        System.out.println(nuevaFrase);

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a') {

                System.out.print('-');
            } else {
                System.out.print(frase.charAt(i));
            }
        }

    }
}
