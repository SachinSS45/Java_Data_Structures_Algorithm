package Medium;
/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
public class Program07 {
    public static void main(String[] args) {
        
        for(int row = 1;row <=5;row ++){
            for(int col = 1;col<=5-row+1;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
