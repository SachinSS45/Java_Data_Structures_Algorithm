/*
 * Q.6 : Power of a number
 *  n = 4 , pow = 3
 *  output : 64
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        
        int n = 4;
        int pow = 3;
        int ans = 1;
        for(int i=1;i<=pow;i++){
            ans = ans * n;
        }
        System.out.println(ans);
    }
}
