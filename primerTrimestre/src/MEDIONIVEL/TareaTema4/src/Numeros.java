public class Numeros {

    public static void main(String[] args) throws Exception {
        int x = 1;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (i >= j) {
                    System.out.print("" + x);

                }

            }

            System.out.println();
            x++;
        }

        System.out.println();

        int y = 1;

        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("" + y);
                }

            }

            System.out.println();
            y++;
        }

        System.out.println();

        int z = 9;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("" + z);
                }

            }

            System.out.println();
            z--;
        }

        System.out.println();

        int w = 9;

        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {

                System.out.print("" + w);

            }

            System.out.println();
            w--;
        }

        System.out.println();


        int h = 1;

        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("" + h+" ");
                }

            }

            System.out.println();
            h++;
        }
        
        System.out.println();


        int f = 9;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("" + f+" ");
                }

            }

            System.out.println();
            f--;
        }


    }
}
