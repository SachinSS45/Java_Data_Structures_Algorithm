package Advance;
/*
 *       1
 *     1 2 1
 *   1 2 3 2 1
 * 1 2 3 4 3 2 1
 */
public class Program02 {
    public static void main(String[] args) {
        
        for(int row = 1; row <= 4 ; row++){
            //for space
            for(int space = 1;space <= (4-row);space++){
                System.out.print("  ");
            }
            //for 1 to row 
            for(int col = 1;col<=row;col++){
                System.out.print(col + " ");
            }
            //for row-1 to 1
            for(int col = row-1; col>=1;col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
