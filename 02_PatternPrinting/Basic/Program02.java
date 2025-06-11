package Basic;
/*
 *  a a a a a
 *  b b b b b 
 *  c c c c c
 *  d d d d d 
 *  e e e e e
 */
public class Program02 {
    public static void main(String[] args) {
        
        for(int row = 1;row<=5;row++){

            for(int col = 1;col<=5;col++){
                System.out.print((char)('a'+row-1) + " ");
            }
            System.out.println();
        }
    }
}
