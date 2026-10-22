package src;
public class Pattern {

    public static void triangle(int n) {

        boolean flag = true;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                    flag = false;
                } else {
                    System.out.print(0 + " ");
                    flag = true;
                }
            }
            // flag = true;
            System.out.println();
        }
    }

    public static void butterfly(int n) {

        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for second half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n) {

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowrhombus(int n){

    }
    public static void main(String[] args) {
        // triangle(10);
        // butterfly(7);
        rhombus(5);
        hollowrhombus(5); 
    }

}
