package Advance;

import java.util.Scanner;

/*
 *                  *
 *                * * *
 *              * * * * *
 *            * * * * * * *
 *          * * * * * * * * *
 */
public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no of rows

        for(int row = 1; row <= n;row++){
            
            //space 
            for(int space = 1;space<=(n-row);space++){
                System.out.print("  ");
            }
            //for star : print * 2*row-1 times
            for(int col = 1;col <= (2*row-1);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
