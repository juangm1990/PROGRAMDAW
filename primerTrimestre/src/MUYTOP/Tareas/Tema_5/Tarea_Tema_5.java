package Tareas.Tema_5;

import java.util.Scanner;

public class Tarea_Tema_5 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int dniUsuario;

        System.out.println("introduce solo el número de tu DNI: ");
        dniUsuario = input.nextInt();

        Persona p1 = new Persona();
        Persona p2 = new Persona("658912030", "alejandro@gmail.es", "08/12/1998", "31017272R");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(dniUsuario);

        input.close();
    }
}
