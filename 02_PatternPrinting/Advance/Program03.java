package Advance;
/*
 *  * * * * * * * * *
 *    * * * * * * *
 *      * * * * *
 *        * * *
 *          *
 */
public class Program03 {
    public static void main(String[] args) {
        for(int row = 5;row>=1 ;row--){

            //space 
            for(int space = 1;space<=(5-row);space++){
                System.out.print("  ");
            }
            //for * (2*row - 1) times
            for(int col = 1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
