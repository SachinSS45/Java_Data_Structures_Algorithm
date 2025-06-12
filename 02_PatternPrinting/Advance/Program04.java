package Advance;
/*
 *  * * * * * * * *
 *  * * *     * * *
 *  * *         * *
 *  *             *
 *  *             *
 *  * *         * *
 *  * * *     * * *
 *  * * * * * * * *
 */
public class Program04 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = n;row>=1;row--){

            //for star
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            //for space
            for(int space = 1;space<=2*(n-row);space++){
                System.out.print("  ");
            }
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for second half
        for(int row = 1;row<=n;row++){

            //for star
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            //for space
            for(int space = 1;space<=2*(n-row);space++){
                System.out.print("  ");
            }
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd approch
        for (int i = 1; i <= 2 * n; i++) {
            int row;

            // Determine row count based on which half we're in
            if (i <= n) {
                row = n - i + 1;
            } else {
                row = i - n;
            }

            // Print left stars
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - row); j++) {
                System.out.print("  ");
            }

            // Print right stars
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
