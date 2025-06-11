/*
 * Q.5 Print table of given number
 *  Like 6 table : 
 *  6 12 18 24 30 36 42 48 54 60
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 6;
        for(int i=1;i<=10;i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}
