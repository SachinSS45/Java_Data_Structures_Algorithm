package Intermidiate;

import java.util.Scanner;

/*
 *          1
 *        2 2
 *      3 3 3
 *    4 4 4 4
 *  5 5 5 5 5
 */
public class Program02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no of rows
        for(int row = 1; row <= n; row++){

            //space
            for(int space = 1; space <= (n-row); space++){
                System.out.print("\t");
            }
            //pattern print row no row times
            for(int col = 1;col<=row;col++){
                System.out.print(row + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
