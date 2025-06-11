package Medium;
/*
    a
    b b
    c c c
    d d d d
    e e e e e
 */
public class Program05 {
   public static void main(String[] args) {
        for(int row = 1;row <=5;row++){
            char ch = (char) ('a' + row -1);
            for(int col = 1;col<=row;col++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
   } 
}
