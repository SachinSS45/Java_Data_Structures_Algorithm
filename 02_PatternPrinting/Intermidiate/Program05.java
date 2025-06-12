package Intermidiate;

import java.util.Scanner;

/*
 *         1
 *       2 1
 *     3 2 1
 *   4 3 2 1
 * 5 4 3 2 1
 */
public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no of rows
        for(int row = 1; row <= n; row++){

            //space
            for(int space = 1; space <= (n-row); space++){
                System.out.print("\t");
            }
            //pattern print row  to 1 
            for(int col = row;col>=1;col--){
                System.out.print(col + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
