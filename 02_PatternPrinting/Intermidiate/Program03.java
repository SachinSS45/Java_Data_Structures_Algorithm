package Intermidiate;
import java.util.Scanner;
/*
 *          1
 *        1 2
 *      1 2 3
 *    1 2 3 4
 *  1 2 3 4 5
 */
public class Program03 {
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
                System.out.print(col + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}

