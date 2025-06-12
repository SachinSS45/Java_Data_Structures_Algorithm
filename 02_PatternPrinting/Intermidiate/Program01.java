package Intermidiate;
/*
                   *
                 * *
               * * *
             * * * *
           * * * * *  
 */
public class Program01 {
    public static void main(String[] args) {
        
        for(int row = 1;row <= 5; row++){

            //space
            for(int space = 1;space <= (5-row);space++){
                System.out.print("  ");
            }
            //Print * 
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
