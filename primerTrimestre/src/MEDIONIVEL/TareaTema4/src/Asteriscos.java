public class Asteriscos {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (i >= j) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {

                
               System.out.print("*");
                
            }

            System.out.println();
        }

            System.out.println();

    
            for (int i = 8; i >= 0; i--) {
                for (int j = 0; j < 9; j++) {
    
                    if (i > j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
    
                }System.out.println("");
            }

                System.out.println();

                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
        
                        if (i > j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("* ");
                        }
                       
        
                    } 
        
                    System.out.println();
                 }




    }}


