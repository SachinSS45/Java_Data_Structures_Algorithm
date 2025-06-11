package Basic;
/*
 *  a b c d e
 *  a b c d e
 *  a b c d e
 *  a b c d e
 *  a b c d e
 */
public class Program03 {
    public static void main(String[] args) {
        
        for(int row = 1;row<=5;row++){
            for(char ch='a';ch<='e';ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
