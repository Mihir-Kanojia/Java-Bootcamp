package JavaPatternProgram;

/**
 Expected Output:
 *
 * *
 * * *
 * * * *
 * * * * *

*/
public class Pattern2 {

    public static void main(String[] args) {

        int n = 5;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
