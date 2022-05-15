package JavaPatternProgram;

/**
 Expected Output
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

*/
class Pattern1 {

    public static void main(String[] args) {

        int n = 5;// n is number of rows

        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }


    }
}
