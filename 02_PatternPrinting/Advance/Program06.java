/*
 *         * 
 *        * * 
 *       * * *
 *      * * * * 
 *      * * * * 
 *       * * *
 *        * *
 *         * 
 */
public class Program06 {
    public static void main(String[] args) {
        for(int row = 1; row<=4;row++){

            //space
            for(int space = 1;space<=4-row;space++){
                System.out.print(" ");
            }
            //star
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 4; row>=1;row--){

            //space
            for(int space = 1;space<=4-row;space++){
                System.out.print(" ");
            }
            //star
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
