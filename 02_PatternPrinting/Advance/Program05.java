package Advance;

/*
 *  *             *
 *  * *         * *
 *  * * *     * * *
 *  * * * * * * * *
 *  * * *     * * * 
 *  * *         * *
 *  *             * 
 */
public class Program05 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            // star ( row times)
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // space (2*n - 2*row) times
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print("  ");
            }
            // star - row times
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    
        for (int row = n-1; row >=1; row--) {
            // star ( row times)
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // space (2*n - 2*row) times
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print("  ");
            }
            // star - row times
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        //row count
        for(int i=1;i<=2*n-1;i++){
            int row = 0;
            if(i<=n){
                row = i;
            }else{
                row = 2*n - i;
            }
        }
        
    }
}
