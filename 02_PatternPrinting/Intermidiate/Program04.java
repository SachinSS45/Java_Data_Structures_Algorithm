package Intermidiate;

import java.util.Scanner;

/*
 *         A
 *       A B 
 *     A B C
 *   A B C D
 * A B C D E
 */
public class Program04 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no of rows
        for(int row = 1; row <= n; row++){

            //space
            for(int space = 1; space <= (n-row); space++){
                System.out.print("\t");
            }
            //pattern A to A+row-1 
            for(char ch = 'A';ch<= 'A'+row-1;ch++){
                System.out.print(ch + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
