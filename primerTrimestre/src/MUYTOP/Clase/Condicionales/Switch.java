package Clase.Condicionales;

public class Switch {
    public static void main(String[] args) throws Exception {
        
        int edad = 5;

        //Se recomienda más en casos de rangos
        if(edad<18){
            System.out.println("Es menor de edad");
        }
        else if(edad>=18 && edad<65){
            System.out.println("Eres adulto");
        }
        else{
            System.out.println("Eres jubilado");
        }

        //No sirve de nada esto en este caso, se alargaría muchísimo el código
        //Se recomienda más en casos específicos, con pocos 'case'
        switch(edad){
            case 0:
            case 1:
            case 2:
            case 17:
                System.out.println("Menor de edad");
                break;
            case 18:
                System.out.println("Mayor de edad");
                break;
            default:
                System.out.println("Eres jubilado");
        }

    }
}
